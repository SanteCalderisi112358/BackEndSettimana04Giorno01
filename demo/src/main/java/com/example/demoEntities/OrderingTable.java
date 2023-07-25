package com.example.demoEntities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.DemoApplication;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Order(2)
@NoArgsConstructor
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class OrderingTable implements CommandLineRunner {
	@Value("${application.coperto}")
	private double coperto;
	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
		/* ORDINAZIONE */
		System.out.println("**********");
		System.out.println("Ordering");
		Ordering order01 = (Ordering) ctx.getBean("getOrdering01");
		int numberPeople = order01.getNumberPeople();
		System.out.println("Ordinazione: ");
		System.out.println(order01.toString());
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

		System.err.println(quantityPizza + " " + pizza.getNamePizza() + " " + pizza.getSize() + ", with " + quantityHam
				+ " " + ham.getNameTopping() + ", " + quantityWater + " " + water.getNameDrink() + ", "
				+ quantityLemonade + " " + lemonade.getNameDrink() + ", " + quantityWine + " " + wine.getNameDrink());
		System.err.println("Cover: " + totalCoperto + " $");
		System.err.printf("Total price Order: %.2f $\n", totalPrice);
		double total = totalCoperto + totalPrice;
		System.err.printf("Total Price ( %.2f $) and cover(" + totalCoperto + " $) = %.2f $\n", totalPrice, total);
		System.err.println("Total calories: " + totalCalories + " kcal");
		ctx.close();
	}

}
