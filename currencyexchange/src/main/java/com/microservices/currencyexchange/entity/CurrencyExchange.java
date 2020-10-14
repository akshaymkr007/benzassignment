package com.microservices.currencyexchange.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author akshay
 *
 */

@Entity
public class CurrencyExchange {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal multiples;
	
	private int port;
	
	
	
	public CurrencyExchange() {
		super();
	}

	public CurrencyExchange(int id, String from, String to, int port) {
		super();
		this.id=id;
		this.from = from;
		this.to = to;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public BigDecimal getMultiples() {
		return multiples;
	}

	public void setMultiples(BigDecimal multiples) {
		this.multiples = multiples;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
