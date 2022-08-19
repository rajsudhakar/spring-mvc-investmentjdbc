package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component // ("shape")
public class Rectangle implements IShape{

	@Override
	public void calcArea(int length, int breadth) {
		System.out.println("Rectangle "+(3*length * breadth));
		
	}

}
