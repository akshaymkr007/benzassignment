package com.microservices.currencyvaluation.service;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.currencyvaluation.entity.CurrencyValuation;

//@FeignClient(name="currency-exchange", url="localhost:8000")
//@FeignClient(name="currency-exchange")
@FeignClient(name="apigateway")
@RibbonClient(name="currency-exchange")
public interface CurrencyValuationServiceProxy {
	
	
	//@GetMapping("/currency-ex/{from}/to/{to}")
	@GetMapping("/currency-exchange/currency-ex/{from}/to/{to}")
	public CurrencyValuation getCurrency(@PathVariable("from") String from, @PathVariable("to") String to);
	
	@GetMapping("/currencies")
	public List<CurrencyValuation> getAllCurrencies();
	

}
