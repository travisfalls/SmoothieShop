package org.elevenfifty.smoothie.beans;

import java.util.ArrayList;
import java.util.List;

public class Produce extends Ingredient {

	protected boolean peelable = false;
	protected boolean pitable = false;
	protected boolean needsWash = false;
	
	@Override
	public List<String> getInstructions(){
		List<String> instructions = new ArrayList<String>();
		if(peelable){

			instructions.add("Peel " + this.type + ":" + this.name);
		}
		
		if(pitable){
			instructions.add("Pit " + this.type + ":" + this.name);
			
		}
		
		if(needsWash){
			instructions.add("Wash " + this.type + ":" + this.name);
			
		}

		instructions.add("Cut " + this.type + ":" + this.name);
		instructions.add("Add " + this.type + ":" + this.name);
		return instructions;
	}

	public boolean isPeelable() {
		return peelable;
	}

	public void setPeelable(boolean peelable) {
		this.peelable = peelable;
	}

	public boolean isPitable() {
		return pitable;
	}

	public void setPitable(boolean pitable) {
		this.pitable = pitable;
	}

	public boolean isNeedsWash() {
		return needsWash;
	}

	public void setNeedsWash(boolean needsWash) {
		this.needsWash = needsWash;
	}

}
