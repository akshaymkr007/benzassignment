/**
 * 
 */
package com.microservices.currencyexchange.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.currencyexchange.entity.CurrencyExchange;

/**
 * @author akshay
 *
 */
@Repository
public interface CurrencyExchangeService extends JpaRepository<CurrencyExchange, Integer>{

	public CurrencyExchange findByFromAndTo(String from,String to);
	
}
