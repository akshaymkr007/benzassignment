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
public class GooseAdapter implements Duck {

	Goose goose=new Goose();
	
	Observable observable;
	
	public GooseAdapter() {
		super();
		observable = new Observable(this);
	}

	public GooseAdapter(Goose goose) {
		super();
		this.goose = goose;
		observable = new Observable(this);
	}

	@Override
	public void Quack() {
		// TODO Auto-generated method stub
		goose.Honk();
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
