package com.example.demoEntities;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.DemoApplication;

public class IsPositiveTest {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
	@Value("${application.coperto}")
	private double coperto;
	Ordering order01 = (Ordering) ctx.getBean("getOrdering01");
	int numberPeople = order01.getNumberPeople();

	Margherita pizza = (Margherita) ctx.getBean("getSalamiPizzaFamily");
	int quantityPizza = 1;
	double pizzaPrice = quantityPizza * pizza.getPrice();
	double pizzaCalories = quantityPizza * pizza.getCalories();
	int quantityHam = 2;
	Ham ham = (Ham) ctx.getBean("getHam");
	double hamPrice = quantityHam * ham.getPriceTopping();
	double hamCalories = quantityHam * ham.getCaloriesTopping();
	Water water = (Water) ctx.getBean("getWater");
	int quantityWater = 2;
	double waterPrice = quantityWater * water.getPriceDrink();
	double waterCalories = quantityWater * water.getCaloriesDrink();
	Lemonade lemonade = (Lemonade) ctx.getBean("getLemonade");
	int quantityLemonade = 2;
	double lemonadePrice = quantityLemonade * lemonade.getPriceDrink();
	double lemonadeCalories = quantityLemonade * lemonade.getCaloriesDrink();
	Wine wine = (Wine) ctx.getBean("getWine");
	int quantityWine = 1;
	double winePrice = quantityWine * wine.getPriceDrink();
	double wineCalories = quantityWine * wine.getCaloriesDrink();
	double totalPrice = pizzaPrice + lemonadePrice + waterPrice + winePrice + hamPrice;
	double totalCalories = pizzaCalories + lemonadeCalories + waterCalories + wineCalories + hamCalories;
	double totalCoperto = numberPeople * coperto;

	@Test
	void testIsPositive() {
		IsPositive isPositive = new IsPositive();
		double result = isPositive.sum(totalCoperto, totalPrice);
		assertTrue(result > 0);
	}
}
