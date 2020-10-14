/**
 * 
 */
package com.microservices.currencyvaluation.entity;

import java.math.BigDecimal;

/**
 * @author akshay
 *
 */
public class CurrencyValuation {

	private int id;
	private String from;
	private String to;
	private BigDecimal multiples;
	private BigDecimal quantity;
	private BigDecimal total;
	private int port;
	
	
	
	public CurrencyValuation() {
		super();
	}
	
	
	
	public CurrencyValuation(int id, String from, String to, BigDecimal multiples, BigDecimal quantity,
			BigDecimal total, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiples = multiples;
		this.quantity = quantity;
		this.total = total;
		this.port = port;
	}



	public BigDecimal getQuantity() {
		return quantity;
	}



	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}



	public BigDecimal getTotal() {
		return total;
	}



	public void setTotal(BigDecimal total) {
		this.total = total;
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
