package com.learn.microservice.limitservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservice.limitservice.bean.Limit;
import com.learn.microservice.limitservice.configuration.Configuration;

@RestController
public class LimitControler {

	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public Limit retriveLimit() {
		return new Limit(configuration.getMinimum(),configuration.getMaximum());
	}
}
