package com.example.microservices.currencyexchangeservice.Controller;

import java.math.BigDecimal;

public class ExchangeValue {
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public BigDecimal getCoversionMutiple() {
		return coversionMutiple;
	}
	public void setCoversionMutiple(BigDecimal coversionMutiple) {
		this.coversionMutiple = coversionMutiple;
	}
	public ExchangeValue()
	{
		
	}
	public ExchangeValue(long id, String from, String to, BigDecimal coversionMutiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.coversionMutiple = coversionMutiple;
	}
	private String from;
	private String to;
	private BigDecimal coversionMutiple;
}
