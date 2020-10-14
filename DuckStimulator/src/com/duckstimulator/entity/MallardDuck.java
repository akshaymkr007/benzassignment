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
public class MallardDuck implements Duck{

	Observable observable;
	
	public MallardDuck() {
		super();
		observable = new Observable(this);
	}

	@Override
	public void Quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		observable.notifyObserver();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

}
