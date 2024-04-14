package com.swapnil;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	
	
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}




	@Override
	public int compareTo(Person o) {
		
		if(this.age>o.age) {
			return 1;
		}else if(this.age<o.age) {
			return -1;
		}else {
			return 0;
		}
		
		
	}

	
	
}
