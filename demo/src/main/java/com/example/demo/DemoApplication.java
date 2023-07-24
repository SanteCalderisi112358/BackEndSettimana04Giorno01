package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		log.info("Esercizio 01: CIAO MONDO!");

		log.info("Esercizio 02: 'Godfather's Pizza'");

	}

	public static void configWithConfigAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

//		log.info((String) ctx.getBean("getName"));
//		log.info(ctx.getBean("getFe").toString());
//
//		log.info(ctx.getBean("getInterviewer").toString());

		ctx.close();
	}

}
