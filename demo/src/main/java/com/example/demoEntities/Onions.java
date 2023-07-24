package com.example.demoEntities;

public class Onions implements Topping {

	@Override
	public String getNameTopping() {
		return "Onions";
	}

	@Override
	public int getCaloriesTopping() {
		return 22;
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
