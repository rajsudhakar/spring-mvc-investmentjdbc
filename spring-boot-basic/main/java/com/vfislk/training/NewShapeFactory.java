package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewShapeFactory {

	//by type 
	@Autowired
	@Qualifier("square")
	IShape shape;
	
	// by name
	@Autowired
	IShape rectangle;
	
	// by constructor
	
	IShape traiangle;
	@Autowired
	public NewShapeFactory(IShape traiangle) {
		super();
		this.traiangle= traiangle;
	}
	
	public void printArea(String choice, int length, int breadth) {
		System.out.println("Printing Area");
		if(choice.equals("s"))
		shape.calcArea(length, breadth);
		if(choice.equals("r"))
		rectangle.calcArea(length, breadth);
		if(choice.equals("t"))
		traiangle.calcArea(length, breadth);
	}
	
	
	
}
