package com.duckstimulator;

import com.duckstimulator.entity.DuckObserver;
import com.duckstimulator.entity.Observable;
import com.duckstimulator.entity.ObserverExample;
import com.duckstimulator.factory.DuckFactory;
import com.duckstimulator.template.Duck;
import com.duckstimulator.template.Observer;

/**
 * 
 */

/**
 * @author akshay
 *
 */
public class DuckStimulator {

	/**
	 * @param args
	 */
	private static void stimulate(Duck duck) {
		// TODO Auto-generated method stub
		duck.Quack();
	}
	
	private static void stimulate(DuckFactory factory) {
		// TODO Auto-generated method stub
		Duck redhead = factory.createRedHeadDuck();
		Duck mallardduck = factory.createMallardDuck();
		Duck goose = factory.createGooseAdapter();
		
		Observer observer = new DuckObserver();
		
		redhead.registerObserver(observer);
		mallardduck.registerObserver(observer);
		goose.registerObserver(observer);
		
		stimulate(redhead);
		stimulate(mallardduck);
		stimulate(goose);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckFactory factory = new DuckFactory();
		stimulate(factory);
		
				
	}

	

	

}
