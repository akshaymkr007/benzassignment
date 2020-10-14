/**
 * 
 */
package com.duckstimulator.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.duckstimulator.template.Duck;
import com.duckstimulator.template.DuckObservable;
import com.duckstimulator.template.Observer;

/**
 * @author akshay
 *
 */
public class Observable implements DuckObservable{
	
	List<Observer> observers = new ArrayList<Observer>();

	Duck duck=null;
	
	
	public Observable() {
		super();
	}

	public Observable(Duck duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		Iterator itr = observers.iterator();
		while(itr.hasNext())
		{
			Observer obs = (Observer) itr.next();
			obs.update(duck);
		}
	}

}
