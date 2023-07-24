package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

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
		System.out.println("**********");
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
		ctx.close();
	}

}
