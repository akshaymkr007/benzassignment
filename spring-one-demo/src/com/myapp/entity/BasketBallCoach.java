/**
 * 
 */
package com.myapp.entity;

import com.myapp.interfaces.Coach;

/**
 * @author akshay
 *
 */
public class BasketBallCoach implements Coach {
	
	private StringBuilder sb;
	
	HappyFortune fortune;
	
	
	
	public BasketBallCoach() {
		super();
	}

	public BasketBallCoach(HappyFortune fortune)
	{
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise to throw ball in basket 100 times";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}
	
	@Override
	public void setMessage(StringBuilder sb)
	{
		this.sb=sb;
	}
	
	@Override
	public StringBuilder getMessage()
	{
		return sb;
	}

}
