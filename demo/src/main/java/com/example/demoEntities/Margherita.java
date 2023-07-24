package com.example.demoEntities;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Margherita implements BaseForPizza {
	protected String ingredients = "tomato,cheese";
	protected Size size;

	public Margherita(Size size) {

		this.size = size;
	}
	@Override
	public String getNamePizza() {

		return "Margherita";
	}

	@Override
	public double getCalories() {
		if (this.size == Size.STANDARD) {
			return 1104;
		} else {
			return 1104 * 1.94;
		}

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
				+ ", Price: "
				+ this.getPrice() + " $";
	}



}
