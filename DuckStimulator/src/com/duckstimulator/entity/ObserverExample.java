/**
 * 
 */
package com.duckstimulator.entity;

import java.util.Observable;
import java.util.Observer;

/**
 * @author akshay
 *
 */
public class ObserverExample implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Weather "+o.getClass().getSimpleName()+" "+arg);
	}

}
