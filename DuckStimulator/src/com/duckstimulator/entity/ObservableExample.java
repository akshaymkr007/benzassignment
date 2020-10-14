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
public class ObservableExample extends Observable{

	private String weather;

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
		
	}
	
	public void getData()
	{
		
		System.out.println(weather);
		setChanged();
		notifyObservers();
	}
	
	
}
