package com.training.auto;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape{

	@Override
	public void calcArea(int length, int breadth) {
		System.out.println("Square "+(2+length*breadth));
		
	}

}
