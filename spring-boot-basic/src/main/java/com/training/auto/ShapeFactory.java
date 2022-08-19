package com.training.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
//	@Autowired
//	@Qualifier("square") // to choose one bean
	
	@Autowired
	IShape rectangle ;
	
	public void printArea(int length, int breadth) {
		
		System.out.println("Printing Area");
		rectangle.calcArea(length, breadth);
	}
}	
