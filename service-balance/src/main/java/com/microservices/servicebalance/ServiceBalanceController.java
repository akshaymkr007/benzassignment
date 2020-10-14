/**
 * 
 */
package com.microservices.servicebalance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.servicebalance.bean.ServiceBalance;
import com.microservices.servicebalance.config.ServiceBalanceConfig;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author akshay
 *
 */

@RestController
public class ServiceBalanceController {

//	@Value("${service-balance.minimum}")
//	private int min;
//
//	@Value("${service-balance.maximum}")
//	private int max;

	@Autowired
	private ServiceBalanceConfig config;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/service-balance")
	public ServiceBalance getServiceBalance()
	{
		log.info("returning service balance values");
		return new ServiceBalance(config.getMinimum(),config.getMaximum());
	}
	
	@GetMapping("/fault-tolerance")
	@HystrixCommand(fallbackMethod="fallbackgetServiceBalance")
	public ServiceBalance getServiceBalanceFault()
	{
		log.info("Throw error message");
		float a=1/0;
		
		return new ServiceBalance(0,0);
	}
	
	public ServiceBalance fallbackgetServiceBalance()
	{
		log.info("fallback method handled exception");
		return new ServiceBalance(547, 557);
	}
	
}
