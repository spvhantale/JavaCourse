package com.swapnil;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}
	public void draw(int radius) {
		System.out.println(radius);
	}

	
}
