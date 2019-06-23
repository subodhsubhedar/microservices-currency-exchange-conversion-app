package com.myapp.currency.conversion.entity;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;

	private String from;

	private String to;

	private BigDecimal qty;

	private BigDecimal convMultiple;

	private BigDecimal totalAmt;

	private int port;

	public CurrencyConversion() {

	}

	public CurrencyConversion(Long id, String from, String to, BigDecimal qty, BigDecimal convMultiple,
			BigDecimal totalAmt, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.qty = qty;
		this.convMultiple = convMultiple;
		this.totalAmt = totalAmt;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getConvMultiple() {
		return convMultiple;
	}

	public void setConvMultiple(BigDecimal convMuliple) {
		this.convMultiple = convMuliple;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
