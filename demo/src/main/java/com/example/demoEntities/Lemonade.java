package com.example.demoEntities;

public class Lemonade implements Drink {

	@Override
	public String getNameDrink() {
		return "Lemonade";
	}

	@Override
	public double getSizeDrink() {
		return 0.33;
	}

	@Override
	public int getCaloriesDrink() {
		return 128;
	}

	@Override
	public double getPriceDrink() {
		return 1.29;
	}

	@Override
	public String toString() {
		return this.getNameDrink() + "(" + this.getSizeDrink() + "L)" + ", Calories: " + this.getCaloriesDrink()
				+ ", Price: " + this.getPriceDrink() + " $";
	}
}
