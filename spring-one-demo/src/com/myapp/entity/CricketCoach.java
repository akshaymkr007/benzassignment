/**
 * 
 */
package com.myapp.entity;

import com.myapp.interfaces.Coach;

/**
 * @author akshay
 *
 */
public class CricketCoach implements Coach {
	
	HappyFortune fortune;
	
	private StringBuilder sb;
	
	private StringBuilder emailid;
	private StringBuilder team;
	
	public StringBuilder getEmailid() {
		return emailid;
	}

	public void setEmailid(StringBuilder emailid) {
		this.emailid = emailid;
	}

	public StringBuilder getTeam() {
		return team;
	}

	public void setTeam(StringBuilder team) {
		this.team = team;
	}

	public CricketCoach() {
		super();
	}

	public CricketCoach(HappyFortune fortune)
	{
	this.fortune = fortune;	
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise batting on allrounder ballers";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	public void setMessage(StringBuilder sb)
	{
		this.sb=sb;
	}
	
	public StringBuilder getMessage()
	{
		return sb;
	}
}
