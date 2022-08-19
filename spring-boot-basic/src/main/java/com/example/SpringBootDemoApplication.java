package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.GreetServiceImpl;
import com.example.service.IGreetService;
import com.training.auto.ShapeFactory;

@SpringBootApplication
@ComponentScan({"com.training.auto","com.example"})
public class SpringBootDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	@Autowired
	IGreetService greetService;
	
	@Autowired
	ShapeFactory shapeFactory;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 
		greetService.greetUser("raj");
		
		shapeFactory.printArea(90, 90);
	}

}
