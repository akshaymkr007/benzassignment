/**
 * 
 */
package com.tiffincenter.app.entity;

import java.util.Observable;
import java.util.Observer;

/**
 * @author akshay
 *
 */
public class TiffinsCounter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Order ready "+o.getClass().getSimpleName());
	}

}
