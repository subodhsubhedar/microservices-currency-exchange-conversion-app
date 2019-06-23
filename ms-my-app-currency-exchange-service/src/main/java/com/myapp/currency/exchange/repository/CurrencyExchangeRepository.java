package com.myapp.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.currency.exchange.entity.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
	
}
