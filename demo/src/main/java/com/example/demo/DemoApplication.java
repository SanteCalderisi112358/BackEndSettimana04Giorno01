package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demoEntities.Ham;
import com.example.demoEntities.Lemonade;
import com.example.demoEntities.Margherita;
import com.example.demoEntities.Water;
import com.example.demoEntities.Wine;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = "com.example.demoEntities")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		log.info("Esercizio 01: CIAO MONDO!");

		log.info("Esercizio 02: 'Godfather's Pizza'");
		configWithConfigAnnotation();
	}

	public static void configWithConfigAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

//		log.info((String) ctx.getBean("getName"));
//		log.info(ctx.getBean("getFe").toString());
//
//		log.info(ctx.getBean("getInterviewer").toString());

		System.out.println("\n");
		System.out.println("Pizzas:");

		System.out.println(ctx.getBean("getMargheritaFamily").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getMargheritaStandard").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getHawaianPizzaFamily").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getHawaianPizzaStandard").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getSalamiPizzaFamily").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getSalamiPizzaStandard").toString());
		System.out.println("**********");
		System.out.println("Toppings");
		System.out.println(ctx.getBean("getCheese").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getHam").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getOnion").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getSalami").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getPineapple").toString());
		System.out.println("**********\n");

		System.out.println("Drinks:");
		System.out.println(ctx.getBean("getLemonade").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getWater").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getWine").toString());
		System.out.println("**********\n");
		System.out.println("Franchise:");
		System.out.println(ctx.getBean("getShirt").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getMug").toString());
		System.out.println("**********");

		/* ORDINAZIONE */
		System.err.println("Ordinazione: ");
		Margherita pizza = (Margherita) ctx.getBean("getMargheritaFamily");
		int quantityPizza = 1;
		double pizzaPrice = quantityPizza * pizza.getPrice();

		int quantityHam = 2;
		Ham ham = (Ham) ctx.getBean("getHam");
		double hamPrice = quantityHam * ham.getPriceTopping();

		Water water = (Water) ctx.getBean("getWater");
		int quantityWater = 2;
		double waterPrice = quantityWater * water.getPriceDrink();

		Lemonade lemonade = (Lemonade) ctx.getBean("getLemonade");
		int quantityLemonade = 2;
		double lemonadePrice = quantityLemonade * lemonade.getPriceDrink();

		Wine wine = (Wine) ctx.getBean("getWine");
		int quantityWine = 1;
		double winePrice = quantityWine * wine.getPriceDrink();

		double total = pizzaPrice + lemonadePrice + waterPrice + winePrice + hamPrice;
		System.out.println(quantityPizza + " " + pizza.getNamePizza() + " " + pizza.getSize() + ", with " + quantityHam
				+ " " + ham.getNameTopping()
				+ ", " + quantityWater + " " + water.getNameDrink() + ", " + quantityLemonade + " "
				+ lemonade.getNameDrink() + ", " + quantityWine + " " + wine.getNameDrink());
		System.out.printf("Total price: %.2f $", total);


		ctx.close();
	}

}
