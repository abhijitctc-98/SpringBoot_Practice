package org.cody.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Cody");

		Demo demo = run.getBean(Demo.class);
		demo.msg();

		Test tt = run.getBean(Test.class);
		tt.prime(100);

		StringPallindrome sp = run.getBean(StringPallindrome.class);
		sp.checkPallidrome("Katak");

		Animal animal = run.getBean(Animal.class);
		animal.eat();

		// Object bean = run.getBean("Test");
		// Test t = (Test) bean;
		
	}

}
