package com.example.demoEntities;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class HawaianPizza extends AbPizza implements IPizza {


	private String ingredientHawaian = ingredients + ", ham, pineapple";

	public HawaianPizza(Size size) {
		super(size);
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
				+ this.getCalories() + " kcal" + ", Price: " + this.getPrice() + " $";
	}



}
