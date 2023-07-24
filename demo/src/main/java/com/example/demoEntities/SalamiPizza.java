package com.example.demoEntities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class SalamiPizza extends Margherita implements BaseForPizza {

	private String ingredientSalami;

	public SalamiPizza(String ingredients, int calories, double price, Size size) {
		super(ingredients, calories, price, size);
		this.ingredientSalami = ingredients + ", salami";
	}





	@Override
	public String getNamePizza() {

		return "Salami Pizza";
	}

	@Override
	public double getCalories() {
		if (this.size == Size.STANDARD) {
			return 1160;
		} else {
			return 1160 * 1.94;
		}

	}

	@Override
	public double getPrice() {
		if (this.size == Size.STANDARD) {
			return 5.99;
		} else {
			return 5.99 + 4.15;
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

