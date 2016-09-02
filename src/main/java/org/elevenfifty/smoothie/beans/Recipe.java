package org.elevenfifty.smoothie.beans;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

	private String name;
	private List<Ingredient> ingredients;
	
	public double getCost(){
		double cost = 0d;
		
		for(Ingredient i : ingredients){
			cost += i.getCost();
		}
		
		return cost;
	}
	
	public List<String> getInstructions(){
		List<String> instructions = new ArrayList<String>();
		
		for(Ingredient i : ingredients){
			instructions.addAll(i.getInstructions());
		}
		
		instructions.add("BLEND!");
		instructions.add("Enjoy!");
		
		return instructions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
