package com.example.demoEntities;

public class Ham implements Topping {

	@Override
	public String getNameTopping() {
		return "Ham";
	}

	@Override
	public int getCaloriesTopping() {
		return 35;
	}

	@Override
	public double getPriceTopping() {
		return 0.69;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + ", Price: "
				+ this.getPriceTopping();
	}
}
