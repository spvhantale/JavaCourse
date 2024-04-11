package com.swapnil;

public class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	public void draw(int length,int breadth) {
		System.out.println("Length: "+length+" "+"Breadth: "+breadth);
	}
	
}
