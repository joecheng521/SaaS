package com.qjc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qjc.service.ISysUserService;

@RestController
public class SysUserController {

	@Autowired
	ISysUserService iSysUserService;
	
	@GetMapping("/index/{id}")
	public Object moneyBoxOrderInfoByRedis(@PathVariable("id") Long id) {
		return iSysUserService.findAll(id);
	}
}
