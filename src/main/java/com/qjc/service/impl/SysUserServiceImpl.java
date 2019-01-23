package com.qjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qjc.data.config.DatabaseContextHolder;
import com.qjc.entry.SysUser;
import com.qjc.mapper.SysUserMapper;
import com.qjc.service.ISysUserService;
@Service
public class SysUserServiceImpl implements ISysUserService {

	@Autowired
	SysUserMapper sysUserMapper;
	
	@Override
	public SysUser findAll(Long id) {
		DatabaseContextHolder.setDBKey("wdataSource");
		return sysUserMapper.selectByPrimaryKey(id);
	}

}
