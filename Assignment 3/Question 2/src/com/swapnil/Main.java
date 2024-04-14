package com.swapnil;

public class Main {

	public static void main(String[] args) {
		Box<Integer> intBox=new Box<>();
		intBox.setObject(10);
		System.out.println(intBox.getObject());
		
		Box<String> stringBox=new Box<>();
		stringBox.setObject("swapnil");
		System.out.println(stringBox.getObject());

	}

}
