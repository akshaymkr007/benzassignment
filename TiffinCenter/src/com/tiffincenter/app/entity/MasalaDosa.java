/**
 * 
 */
package com.tiffincenter.app.entity;

import java.util.Observable;

/**
 * @author akshay
 *
 */
public class MasalaDosa extends Observable{

		public void createDough()
		{
			System.out.println("dough prepared");
		}
		public void prepareDosa() 
		{
			//addingredients()
			System.out.println("Dosa prepared");
		}
		public void serveDosa() 
		{
			System.out.println("Cut Dosa & ready to serve");
			setChanged();
			notifyObservers();
		}
}
