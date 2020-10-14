/**
 * 
 */
package com.microservices.apigateway;

import org.springframework.stereotype.Component;

/**
 * @author akshay
 *
 */
@Component
public class ResponseOfLogs {
	
	private String logs;

	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}
	
	

}
