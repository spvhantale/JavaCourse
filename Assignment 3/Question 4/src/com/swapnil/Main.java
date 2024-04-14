package com.swapnil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void SerializeStudents(List<Student> students,String fileName) throws IOException {
		FileOutputStream fis = new FileOutputStream(fileName);

		ObjectOutputStream oOut = new ObjectOutputStream(fis);

		oOut.writeObject(students);

		oOut.close();
		System.out.println("Serialized");
	}

	public static List<Student> DeserializeStudents(String fileName) throws IOException, ClassNotFoundException {
		List<Student> students=new ArrayList<>();
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		students=(List<Student>)ois.readObject();
		ois.close();
		return students;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Student> students = new ArrayList<>();
		Student student = new Student("Swapnil", 45);
		Student student1 = new Student("Ranjit", 40);
		Student student2 = new Student("Kunal", 30);
		Student student3 = new Student("Vhantale", 19);
		students.add(student);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		SerializeStudents(students,"file.txt");
		
		List<Student> deStudent=DeserializeStudents("file.txt");
		System.out.println(deStudent);
	}

}
