package com.swapnil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("swapnil","vhantale","ranjit","kunal","hole","ran","vha");
		
		List<String> updatedList=list
									.stream()
											.filter(s->s.length()>=4)
													.map(r->r.toUpperCase())
														.collect(Collectors.toList());
		
		System.out.println("Before operations: "+list);
		System.out.println("After update: "+ updatedList);

	}

}
