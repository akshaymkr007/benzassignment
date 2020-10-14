/**
 * 
 */
package com.duckstimulator.template;

/**
 * @author akshay
 *
 */
public interface DuckObservable {

	public void notifyObserver();
	public void registerObserver(Observer observer);
	
}
