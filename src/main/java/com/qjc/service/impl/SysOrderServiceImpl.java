package com.qjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qjc.entry.SysOrder;
import com.qjc.mapper.SysOrderMapper;
import com.qjc.service.ISysOrderService;
@Service
public class SysOrderServiceImpl implements ISysOrderService {

	@Autowired
	SysOrderMapper sysOrderMapper;
	@Override
	public SysOrder findAllOrder(Long id) {
		return sysOrderMapper.selectByPrimaryKey(id);
	}

}
