package com.myapp.currency.conversion.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myapp.currency.conversion.entity.CurrencyConversion;
import com.myapp.currency.conversion.service.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;

	@GetMapping("/currency-converter/{from}/to/{to}/{qty}")
	public CurrencyConversion getConvertedCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal qty) {

		CurrencyConversion resp = proxy.getExchangeValue(from, to);

		return new CurrencyConversion(resp.getId(), from, to, qty, resp.getConvMultiple(),
				(qty.multiply(resp.getConvMultiple())), resp.getPort());
	}

	@GetMapping("/currency-converter-old/{from}/to/{to}/{qty}")
	public CurrencyConversion getConvertedCurrencyOld(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal qty) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CurrencyConversion> respEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/{from}/to/{to}", CurrencyConversion.class, uriVariables);

		CurrencyConversion resp = respEntity.getBody();

		return new CurrencyConversion(resp.getId(), from, to, qty, resp.getConvMultiple(),
				(qty.multiply(resp.getConvMultiple())), resp.getPort());
	}

}
