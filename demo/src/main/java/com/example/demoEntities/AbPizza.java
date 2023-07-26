package com.example.demoEntities;

public abstract class AbPizza {
	protected String ingredients = "tomato,cheese";
	protected Size size;

	public AbPizza(Size size) {


		this.size = size;
	}

}
