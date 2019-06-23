package com.myapp.currency.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.currency.exchange.entity.ExchangeValue;
import com.myapp.currency.exchange.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment env;

	@Autowired
	private CurrencyExchangeRepository repository;

	@GetMapping("/currency-exchange/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeVal = repository.findByFromAndTo(from, to);
		exchangeVal.setPort(Integer.parseInt(env.getProperty("local.server.port")));

		return exchangeVal;

	}
}
