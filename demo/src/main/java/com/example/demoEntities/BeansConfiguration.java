package com.example.demoEntities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	@Bean
	Margherita getMargheritaFamily() {
		return new Margherita(Size.FAMILY);
	}

	@Bean
	Margherita getMargheritaStandard() {
		return new Margherita(Size.STANDARD);
	}

	@Bean

	HawaianPizza getHawaianPizzaFamily() {
		return new HawaianPizza(Size.FAMILY);
	}

	@Bean

	HawaianPizza getHawaianPizzaStandard() {
		return new HawaianPizza(Size.STANDARD);
	}

	@Bean
	SalamiPizza getSalamiPizzaFamily() {
		return new SalamiPizza(Size.FAMILY);
	}

	@Bean
	SalamiPizza getSalamiPizzaStandard() {
		return new SalamiPizza(Size.STANDARD);
	}

	@Bean
	Cheese getCheese() {
		return new Cheese();
	}

	@Bean
	Ham getHam() {
		return new Ham();
	}

	@Bean
	Onions getOnion() {
		return new Onions();
	}

	@Bean
	Salami getSalami() {
		return new Salami();
	}

	@Bean
	Pineapple getPineapple() {
		return new Pineapple();
	}

	@Bean
	Water getWater() {
		return new Water();
	}

	@Bean
	Lemonade getLemonade() {
		return new Lemonade();
	}

	@Bean
	Wine getWine() {
		return new Wine();
	}

	@Bean
	Shirt getShirt() {
		return new Shirt();
	}

	@Bean
	Mug getMug() {
		return new Mug();
	}
}
