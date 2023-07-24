package com.example.demoEntities;

public class Wine implements Drink {

	@Override
	public String getNameDrink() {
		return "Wine";
	}

	@Override
	public double getSizeDrink() {
		return 0.75;
	}

	@Override
	public int getCaloriesDrink() {
		return 607;
	}

	@Override
	public double getPriceDrink() {
		return 7.49;
	}

	public int getAlcool() {
		return 13;
	}

	@Override
	public String toString() {
		return this.getNameDrink() + "(" + this.getSizeDrink() + "L," + this.getAlcool() + "%)" + ", Calories: "
				+ this.getCaloriesDrink() + ", Price: " + this.getPriceDrink() + " $";
	}
}
