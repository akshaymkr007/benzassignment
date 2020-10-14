/**
 * 
 */
package com.tiffincenter.app;

import java.util.Scanner;

import com.tiffincenter.app.entity.MasalaDosa;
import com.tiffincenter.app.entity.TiffinsCounter;

/**
 * @author akshay
 *
 */
public class TiffinCenter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String order=null;
		
		System.out.println("Enter order: ");
		Scanner sc=new Scanner(System.in);
		
		order=sc.nextLine();
		
		if(order.equalsIgnoreCase("masala dosa"))
		{
			TiffinsCounter tc = new TiffinsCounter();
			MasalaDosa md = new MasalaDosa();
			md.addObserver(tc);
			md.createDough();
			md.prepareDosa();
			md.serveDosa();
		}
		else if(order.equalsIgnoreCase("plain dosa"))
		{
			System.out.println("Plain Dosa");
		}
		
		sc.close();
	}

}
