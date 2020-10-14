/**
 * 
 */
package com.duckstimulator;

import java.util.Observable;
import java.util.Observer;

import com.duckstimulator.entity.ObservableExample;
import com.duckstimulator.entity.ObserverExample;

/**
 * @author akshay
 *
 */
public class StimulatorWeather {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer oe=new ObserverExample();
		ObservableExample obs=new ObservableExample();
		
		obs.addObserver(oe);
		obs.setWeather("rainy");
		obs.getData();
		
		System.out.println(obs.countObservers());
	}

}
