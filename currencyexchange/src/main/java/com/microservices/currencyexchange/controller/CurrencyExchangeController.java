/**
 * 
 */
package com.microservices.currencyexchange.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchange.entity.CurrencyExchange;
import com.microservices.currencyexchange.service.CurrencyExchangeService;

/**
 * @author akshay
 *
 */
@RestController
public class CurrencyExchangeController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Environment environment;
	
	@Autowired
	private CurrencyExchangeService currency;
	
	@GetMapping("/currencies")
	public List<CurrencyExchange> retrieveAll()
	{
		List<CurrencyExchange> list=new ArrayList<CurrencyExchange>();
		Iterator it=currency.findAll().listIterator();
		
		while(it.hasNext())
		{
			CurrencyExchange ce=(CurrencyExchange) it.next();
			ce.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			list.add(ce);
		}
		
		return list;
	}
	
	@GetMapping("/getport")
	public Integer getPort()
	{
		logger.info("{}"+Integer.parseInt(environment.getProperty("local.server.port")));
		
		return Integer.parseInt(environment.getProperty("local.server.port"));
	}
	
	@GetMapping("/currency-ex/{from}/to/{to}")
	public CurrencyExchange getCurrency(@PathVariable String from, @PathVariable String to)
	{
//		List<CurrencyExchange> ce=currency.findAll();
//		
//		Iterator itr=ce.listIterator();
//		
//		while(itr.hasNext())
//		{
//			CurrencyExchange cuex=(CurrencyExchange) itr.next();
//			if(cuex.getFrom().equalsIgnoreCase(from) && cuex.getTo().equalsIgnoreCase(to))
//			{
//			cuex.setPort(Integer.parseInt(environment.getProperty("local.server.port")));	
//			return cuex;
//			}
//		}
		
		CurrencyExchange ce=currency.findByFromAndTo(from.toUpperCase(), to.toUpperCase());
		logger.info("{}"+ce);
		ce.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return ce;
		}
}
