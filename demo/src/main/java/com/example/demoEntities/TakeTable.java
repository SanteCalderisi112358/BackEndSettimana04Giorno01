package com.example.demoEntities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.DemoApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Order(1)
public class TakeTable implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
		System.out.println("**********");
		System.out.println("TABLE LIST");
		Table table01 = (Table) ctx.getBean("getTable01");
		System.out.println(table01.toString());
		table01.checkTable();
		Table table02 = (Table) ctx.getBean("getTable02");
		System.out.println(table02.toString());
		table02.checkTable();
		Table table03 = (Table) ctx.getBean("getTable03");
		System.out.println(table03.toString());
		table03.checkTable();
		Table table04 = (Table) ctx.getBean("getTable04");
		System.out.println(table04.toString());
		table04.checkTable();
		Table table05 = (Table) ctx.getBean("getTable05");
		System.out.println(table05.toString());
		table05.checkTable();

		ctx.close();
	}

}
