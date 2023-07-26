package com.example.demoEntities;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Margherita extends AbPizza implements IPizza {



	public Margherita(Size size) {
		super(size);

	}

	@Override
	public String getNamePizza() {

		return "Margherita";
	}

	@Override
	public double getCalories() {
		double calories;
		if (this.size == Size.STANDARD) {
			calories = 1104;
		} else {
			calories = 1104 * 1.94;
		}

		calories = Math.round(calories * 100.0) / 100.0;

		return calories;
	}


	@Override
	public double getPrice() {
		if (this.size == Size.STANDARD) {
			return 4.99;
		} else {
			return 4.99 + 4.15;
		}

	}

	@Override
	public Size getSize() {
		if (this.size == Size.FAMILY) {
			return Size.FAMILY;
		} else {
			return Size.STANDARD;
		}

	}

	@Override
	public String toString() {

		return "Margherita Pizza (" + this.ingredients + "), Size: " + this.size + ", Calories: " + this.getCalories()
				+ " kcal"
				+ ", Price: " + getPrice() + " $";
	}




}
