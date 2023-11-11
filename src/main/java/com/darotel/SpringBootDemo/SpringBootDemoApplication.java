package com.darotel.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
//		System.out.println("**************Calling Alien class with object**************");
//		SpringApplication.run(SpringBootDemoApplication.class, args);
//
//		Alien obj = new Alien();
//		obj.show();

		System.out.println("******************Using ApplicationContext Approach******************");
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Alien a = context.getBean(Alien.class);
		a.setaId(1);
		a.setaName("Musa");
		a.setaAge(20);

		Alien a1 = context.getBean(Alien.class);
		a1.setaId(2);
		a1.setaName("Mandla");
		a1.setaAge(21);

		AlienService service = context.getBean(AlienService.class);
//		a.show();
		service.addAlien(a);
		service.addAlien(a1);
		//when using this class we have, have to add component annotation to its class
	}

}
