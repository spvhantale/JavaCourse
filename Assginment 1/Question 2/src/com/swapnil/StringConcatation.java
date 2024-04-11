package com.swapnil;

public class StringConcatation {

	private static String str="a";
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			str+="a";
		}
		long endTime = System.currentTimeMillis();
		System.out.println(str);
		System.out.println(endTime-startTime);
	}
}
