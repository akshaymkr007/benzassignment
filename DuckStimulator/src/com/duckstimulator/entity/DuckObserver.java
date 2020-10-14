/**
 * 
 */
package com.duckstimulator.entity;

import com.duckstimulator.template.Duck;
import com.duckstimulator.template.Observer;

/**
 * @author akshay
 *
 */
public class DuckObserver implements Observer {

	@Override
	public void update(Duck duck) {
		// TODO Auto-generated method stub
		System.out.println(duck.getClass().getSimpleName()+" has quacked");

	}

}
