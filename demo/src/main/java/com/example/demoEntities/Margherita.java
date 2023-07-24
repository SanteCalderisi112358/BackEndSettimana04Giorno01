package com.example.demoEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Margherita implements BaseForPizza {
	private String ingredients = "tomato,cheese";
	private int calories;
	private double price;
	protected Size size;
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

}
