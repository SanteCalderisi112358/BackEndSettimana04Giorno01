package com.example.demoEntities;

public class Salami implements Topping {

	@Override
	public String getNameTopping() {
		return "Salami";
	}

	@Override
	public int getCaloriesTopping() {
		return 86;
	}

	@Override
	public double getPriceTopping() {
		return 0.99;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + " kcal" + ", Price: "
				+ this.getPriceTopping() + " $";
	}

}
