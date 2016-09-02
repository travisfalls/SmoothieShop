package org.elevenfifty.smoothie.decoratored;

import java.util.List;

public interface Item {

	public List<String> getInstructions();
	
	public double getCost();

	public List<String> getIngredients();
}
