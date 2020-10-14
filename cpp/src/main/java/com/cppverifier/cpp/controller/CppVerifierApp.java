/**
 * 
 */
package com.cppverifier.cpp.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author akshay
 *
 */

@RestController

public class CppVerifierApp {

	@Value("${cppverifier.url}")
	private String url;
	
	@Value("${cpp.url}")
	private String cppurl;
	
	@GetMapping("/getCppTest")
	public ResponseEntity getTest(@RequestParam("IvSn") String IvSn, @RequestParam("IvGtin") String IvGtin, 
			@RequestParam("IvGpsLatitude") String IvGpsLatitude, @RequestParam("IvGpsLongitude") String IvGpsLongitude)
	{
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("IvSn", IvSn);
		uriVariables.put("IvGtin", IvGtin);
		uriVariables.put("IvGpsLatitude", IvGpsLatitude);
		uriVariables.put("IvGpsLongitude",IvGpsLongitude);
		Class object = null;
		ResponseEntity response=(ResponseEntity) new RestTemplate().getForObject(cppurl
				+IvSn+","+IvGtin+","+IvGpsLatitude+","+IvGpsLongitude+")", Object.class, uriVariables);
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      
				
		return response;

	}
	
	@PostMapping("/postCppTest")
	public Object postTest()
	{
	
		Class object = null;
		ResponseEntity response=(ResponseEntity) new RestTemplate().getForObject(url, object);

		return response;
//https://map2.basf.com/com.basf.SCTT/CategoriesGPS(IvSn=%27DEFE2823%27,IvGtin=%2704014348263802%27,
		//IvGpsLatitude=%2718.581775%27,IvGpsLongitude=%2773.7380531%27)
	}
	
}
