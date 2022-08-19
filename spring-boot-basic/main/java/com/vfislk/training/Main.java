package com.vfislk.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.vfislk.training");
//        ShapeFactory shapeFactory = (ShapeFactory) context.getBean(ShapeFactory.class,"shapefactory");
//       shapeFactory.printArea(10, 20);
       
       NewShapeFactory shape = (NewShapeFactory) context.getBean(NewShapeFactory.class,"newShapefactory");
       shape.printArea("t", 10, 10);
        
	
	}
}
