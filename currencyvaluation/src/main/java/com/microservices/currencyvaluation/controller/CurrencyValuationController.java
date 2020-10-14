/**
 * 
 */
package com.microservices.currencyvaluation.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.currencyvaluation.entity.CurrencyValuation;
import com.microservices.currencyvaluation.service.CurrencyValuationServiceProxy;

/**
 * @author akshay
 *
 */
@RestController
public class CurrencyValuationController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CurrencyValuationServiceProxy proxy;
	
	@GetMapping("/currency-valuation/{from}/to/{to}/quantity/{quantity}")
	public CurrencyValuation getValuation(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)
	{
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
	ResponseEntity<CurrencyValuation> responseEntity=new RestTemplate().getForEntity("http://localhost:8001/currency-ex/{from}/to/{to}",
			CurrencyValuation.class, uriVariables);	
	CurrencyValuation response = responseEntity.getBody();
	log.info("{}"+response);
	return new CurrencyValuation(response.getId(), response.getFrom(), response.getTo(), response.getMultiples(),
			quantity, quantity.multiply(response.getMultiples()), response.getPort());
	}
	
	
	@GetMapping("/currency-valuation-feign/{from}/to/{to}/quantity/{quantity}")
	public CurrencyValuation getFValuation(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
	CurrencyValuation response = proxy.getCurrency(from, to);
	log.info("{}"+response);
	return new CurrencyValuation(response.getId(), response.getFrom(), response.getTo(), response.getMultiples(),
			quantity, quantity.multiply(response.getMultiples()), response.getPort());
	}
	
	@GetMapping("/currencies")
	public List<CurrencyValuation> getAllCurrency()
	{
		return proxy.getAllCurrencies();
	}
	
}
