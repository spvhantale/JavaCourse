package com.swapnil;

public class StringBuilderConcatation {

	private static StringBuffer str=new StringBuffer("a");
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			str.append("a");
		}
		long endTime = System.currentTimeMillis();
		System.out.println(str);
		System.out.println(endTime-startTime);
	}
}
