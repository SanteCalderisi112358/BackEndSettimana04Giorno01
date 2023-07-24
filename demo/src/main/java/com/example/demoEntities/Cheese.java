package com.example.demoEntities;

public class Cheese implements Topping {

	@Override
	public String getNameTopping() {

		return "Cheese";
	}

	@Override
	public int getCaloriesTopping() {
		return 92;
	}

	@Override
	public double getPriceTopping() {
		return 0.69;
	}

	@Override
	public String toString() {
		return getNameTopping() + ", Calories: " + getCaloriesTopping() + ", Price: " + getPriceTopping();
	}
}
