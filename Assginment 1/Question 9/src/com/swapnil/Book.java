package com.swapnil;

public class Book extends Resource implements Search{
	private String author;

	public Book(String title,String author) {
		super(title);
		this.author=author;
	}

	@Override
	public void searchBook(String query) {
		
		if(getTitle().contains(query) || author.contains(query)) {
			System.out.println("Book found: "+getTitle()+" Author: "+author);
		}else {
			System.out.println("No found");
		}
		
	}

}
