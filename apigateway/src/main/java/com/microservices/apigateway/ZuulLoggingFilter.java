/**
 * 
 */
package com.microservices.apigateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author akshay
 *
 */
@Component
public class ZuulLoggingFilter extends ZuulFilter{

	@Autowired
	ResponseOfLogs rol;
	
	public Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		
	HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
	log.info("{} request -> {}, request URI: {}", request, request.getRequestURI());
		
	//rol.setLogs("request -> {}, request URI: {} "+request+" "+request.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
