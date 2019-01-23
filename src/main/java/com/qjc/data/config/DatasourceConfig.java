package com.qjc.data.config;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages = DatasourceConfig.PACKAGE, sqlSessionFactoryRef = "sqlSessionFactory")
public class DatasourceConfig {
	// 精确到 master 目录，以便跟其他数据源隔离
	static final String PACKAGE = "spring.datasource.druid";
	static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
	@Value("${spring.datasource.druid.master.url}")
	private String masterUrl;

	@Value("${spring.datasource.druid.master.username}")
	private String masterUsername;

	@Value("${spring.datasource.druid.master.password}")
	private String masterPassword;

	@Value("${spring.datasource.druid.master.driver-class-name}")
	private String masterDriverClassName;

	@Value("${spring.datasource.druid.cluster.url}")
	private String clusterUrl;

	@Value("${spring.datasource.druid.cluster.username}")
	private String clusterUsername;

	@Value("${spring.datasource.druid.cluster.password}")
	private String clusterPassword;

	@Value("${spring.datasource.druid.cluster.driver-class-name}")
	private String clusterDriverClassName;

	@Value("${spring.datasource.initialSize}")
	private int initialSize;

	@Value("${spring.datasource.minIdle}")
	private int minIdle;

	@Value("${spring.datasource.maxActive}")
	private int maxActive;

	@Value("${spring.datasource.maxWait}")
	private int maxWait;

	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Value("${spring.datasource.validationQuery}")
	private String validationQuery;

	@Value("${spring.datasource.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${spring.datasource.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${spring.datasource.testOnReturn}")
	private boolean testOnReturn;

	@Value("${spring.datasource.poolPreparedStatements}")
	private boolean poolPreparedStatements;

	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${spring.datasource.filters}")
	private String filters;

	@Value("{spring.datasource.connectionProperties}")
	private String connectionProperties;
	
	
	@Bean(name = "dynamicDataSource")
    @Primary
    public DynamicDataSource dynamicDataSource() {
    	DynamicDataSource dynamicDataSource = DynamicDataSource.getInstance();
 
    	//jdbc配置
        DruidDataSource wdataSource = new DruidDataSource();
        wdataSource.setDriverClassName(masterDriverClassName);
        wdataSource.setUrl(masterUrl);
        wdataSource.setUsername(masterUsername);
        wdataSource.setPassword(masterPassword);
        
        //连接池配置
        wdataSource.setMaxActive(maxActive);
        wdataSource.setMinIdle(minIdle);
        wdataSource.setInitialSize(initialSize);
        wdataSource.setMaxWait(maxWait);
        wdataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        wdataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        wdataSource.setTestWhileIdle(testWhileIdle);
        wdataSource.setTestOnBorrow(testOnBorrow);
        wdataSource.setTestOnReturn(testOnReturn);
        wdataSource.setValidationQuery("SELECT 'x'");
        wdataSource.setPoolPreparedStatements(true);
        wdataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        try {
        	wdataSource.setFilters("stat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        //jdbc配置
        DruidDataSource rdataSource = new DruidDataSource();
        rdataSource.setDriverClassName(clusterDriverClassName);
        rdataSource.setUrl(clusterUrl);
        rdataSource.setUsername(clusterUsername);
        rdataSource.setPassword(clusterPassword);
        
        //连接池配置
        rdataSource.setMaxActive(maxActive);
        rdataSource.setMinIdle(minIdle);
        rdataSource.setInitialSize(initialSize);
        rdataSource.setMaxWait(maxWait);
        rdataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        rdataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        rdataSource.setTestWhileIdle(testWhileIdle);
        rdataSource.setTestOnBorrow(testOnBorrow);
        rdataSource.setTestOnReturn(testOnReturn);
        rdataSource.setValidationQuery("SELECT 'x'");
        rdataSource.setPoolPreparedStatements(true);
        rdataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        try {
			rdataSource.setFilters("stat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        Map<Object,Object> map = new HashMap<>();
        map.put("wdataSource", wdataSource);
        map.put("rdataSource", rdataSource);
        
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(rdataSource);
        
        return dynamicDataSource;
    }
 
    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
 
    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dynamicDataSource") DataSource dynamicDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dynamicDataSource);
        sessionFactory.setTypeAliasesPackage("com.qjc.entry");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DatasourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}
