package com.swapnil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\nFile Operations Menu: ");
			System.out.println("1. Read a Text File");
            System.out.println("2. Write to a Text File");
            System.out.println("3. Analyze File Content");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	
            	readTextFile(sc);
            	break;
            case 2:
            	writeTextFile(sc);
            	break;
            case 3:
            	analyzeFileContent(sc);
            	break;
            case 4:
            	System.out.println("Exit ...");
            	sc.close();
            	System.exit(0);
            default:
            	System.out.println("Invalid Choice");
            	break;
            
            }
		}

	}

	private static void analyzeFileContent(Scanner sc) {
		
		System.out.println("Enter the file Path: ");
		String filePath=sc.nextLine();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(filePath));
			String line;
			int totalWords=0;
			Map<String,Integer> wordFrequency=new HashMap<>();
			while((line=reader.readLine())!=null) {
				String[] words=line.split("\\s+");
				for(String word:words) {
					word=word.toLowerCase();
					if(!word.isEmpty()) {
						wordFrequency.put(word, wordFrequency.getOrDefault(word, 0)+1);
						totalWords++;
					}
				}
			}
			System.out.println("Total number of words: "+totalWords);
			System.out.println("Number of unique words: "+wordFrequency.size());
			System.out.println("Word Frequency: ");
			for(Map.Entry<String, Integer> entry:wordFrequency.entrySet()){
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found:  "+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Reading file: "+e.getMessage());
		}
		
		
	}

	private static void writeTextFile(Scanner sc) {
		System.out.println("Enter the file Path: ");
		String filePath=sc.nextLine();
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter(filePath));
			System.out.println("Enter the text to write in the file after finishing press Enter");
			String text;
			while(!(text=sc.nextLine()).isEmpty()) {
				writer.write(text);
				writer.newLine();
			}
			System.out.println("Text written to the file successfully. ");
			writer.close();
		} catch (IOException e) {
			
			System.out.println("Error writing to file: "+e.getMessage());
		}
		
		
	}

	private static void readTextFile(Scanner sc) {
		System.out.println("Enter the file Path: ");
		String filePath=sc.nextLine();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(filePath));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
