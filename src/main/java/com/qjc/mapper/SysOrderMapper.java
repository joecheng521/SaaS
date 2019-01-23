package com.qjc.mapper;

import com.qjc.entry.SysOrder;
import com.qjc.entry.SysOrderExample;
import java.util.List;

public interface SysOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    List<SysOrder> selectByExampleWithBLOBs(SysOrderExample example);

    List<SysOrder> selectByExample(SysOrderExample example);

    SysOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKeyWithBLOBs(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}