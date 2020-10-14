package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.myapp.entity.*;
import com.myapp.interfaces.Coach;
import com.myapp.logging.MyLoggerConfig;

/**
 * 
 */

/**
 * @author akshay
 *
 */

public class MyFirstApp {
	
//	@RequestMapping(path = "/hello-world", produces = MediaType.TEXT_HTML_VALUE)
//	
//	public void greetWorld()
//	{
//	System.out.println("Hello wrold");
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Coach bbcoach = new BasketBallCoach();
//		Coach ccoach = new CricketCoach();
//		
//		System.out.println("basketball : "+bbcoach.getDailyWorkout()+"\ncricket: "+ccoach.getDailyWorkout());
		
		MyLoggerConfig lc= (MyLoggerConfig) ac.getBean("mylogger");
		
		Coach bb = (Coach) ac.getBean("bbcoach", Coach.class);
		Coach cc = (Coach) ac.getBean("ccoach", Coach.class);
		
		CricketCoach cric = (CricketCoach) ac.getBean("ccoach");
		
		System.out.println(bb.getFortune()+"\nac data : "+bb.getDailyWorkout()+"\t"+bb.getMessage()+" \n"+cc.getDailyWorkout()+"\t"+cc.getMessage()+"\n"+cc.getFortune());
		
		
		System.out.println("\n\n"+cric.getFortune()+"\n"+cric.getDailyWorkout()+"\n"+cric.getEmailid()+"\n"+cric.getTeam()+"\n"+cric.getMessage());
		ac.close();
	}

}
