/**
 * 
 */
package com.myapp.entity;

import com.myapp.interfaces.MyFortune;

/**
 * @author akshay
 *
 */
public class HappyFortune implements MyFortune{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Hi, Greeting for the Day";
	}

}
