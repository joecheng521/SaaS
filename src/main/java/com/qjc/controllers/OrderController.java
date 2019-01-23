package com.qjc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qjc.service.ISysOrderService;

@RestController
public class OrderController {
	@Autowired
	ISysOrderService iSysOrderService;
	
	@GetMapping("/index2/{id}")
	public Object orderById(@PathVariable("id") Long id) {
		return iSysOrderService.findAllOrder(id);
	}
}
