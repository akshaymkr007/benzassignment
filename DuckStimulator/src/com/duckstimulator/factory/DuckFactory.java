/**
 * 
 */
package com.duckstimulator.factory;

import com.duckstimulator.entity.Goose;
import com.duckstimulator.entity.GooseAdapter;
import com.duckstimulator.entity.MallardDuck;
import com.duckstimulator.entity.RedHeadDuck;
import com.duckstimulator.template.Duck;

/**
 * @author akshay
 *
 */
public class DuckFactory {

	public Duck createRedHeadDuck()
	{
		return new RedHeadDuck();
	}
	public Duck createMallardDuck()
	{
		return new MallardDuck();
	}
	public Duck createGooseAdapter()
	{
		return new GooseAdapter(new Goose());
	}
	

}
