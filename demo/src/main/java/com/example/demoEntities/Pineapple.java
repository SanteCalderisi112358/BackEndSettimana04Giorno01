package com.example.demoEntities;

public class Pineapple implements Topping {

	@Override
	public String getNameTopping() {
		return "Pineaplle";
	}

	@Override
	public int getCaloriesTopping() {
		return 24;
	}

	@Override
	public double getPriceTopping() {
		return 0.79;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + " kcal" + ", Price: "
				+ this.getPriceTopping() + " $";
	}
}
