package com.spring6dependencyinjection.springframework;

import com.spring6dependencyinjection.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyDependencyInjectionProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyDependencyInjectionProjectApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
