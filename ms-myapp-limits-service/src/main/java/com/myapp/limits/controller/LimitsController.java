package com.myapp.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.limits.config.Configuration;
import com.myapp.limits.entity.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public Limits getLimits() {

		return new Limits(config.getMaxLimit(), config.getMinLimit());
	}

}
