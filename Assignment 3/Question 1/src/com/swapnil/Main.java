package com.swapnil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<>();
		Person person1=new Person("Swapnil",25);
		Person person2=new Person("Ranjit",20);
		Person person3=new Person("Kunal",27);
		Person person4=new Person("Hole",25);
		Person person5=new Person("Vhantale",14);
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
//		Collections.sort(list);
		SortByName sortByName=new SortByName();
		Collections.sort(list,sortByName);
		System.out.println(list);
	}

}
