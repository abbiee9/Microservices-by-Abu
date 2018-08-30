package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.LimitBean;
import com.microservice.service.LimitService;

@RestController
public class LimitController 
{
	@Autowired
	private LimitService service;
	
	@GetMapping(value="/limit")
	//@RequestMapping(value="/limit", method=RequestMethod.GET)
	public LimitBean getLimit()
	{
		return new LimitBean(service.getMin(),service.getMax());
		
	}
	
}
