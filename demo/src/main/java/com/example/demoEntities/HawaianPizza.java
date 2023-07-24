package com.example.demoEntities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class HawaianPizza extends Margherita implements BaseForPizza {
	private String ingredientHawaian;

	public HawaianPizza(Size size) {
		super(size);

		this.ingredientHawaian = ingredients + ", ham,pineapple";

	}


	@Override
	public String getNamePizza() {

		return "Hawaian Pizza";
	}

	@Override
	public double getCalories() {
		if (this.size == Size.STANDARD) {
			return 1024;
		} else {
			return 1024 * 1.94;
		}

	}

	@Override
	public double getPrice() {
		if (this.size == Size.STANDARD) {
			return 6.49;
		} else {
			return 6.49 + 4.15;
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
		return "Hawaian Pizza (" + this.ingredientHawaian + "), Size: " + this.getSize() + ", Calories: "
				+ this.getCalories() + ", Price: " + this.getCalories() + " $";
	}

}
