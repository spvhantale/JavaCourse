package com.swapnil;

public class Journal extends Resource implements Search{
	private String publisher;

	public Journal(String title,String publisher) {
		super(title);
		this.publisher=publisher;
	}

	@Override
	public void searchBook(String query) {
		
		if(getTitle().contains(query) || publisher.contains(query)) {
			System.out.println("Journal found: "+getTitle()+" Publisher: "+publisher);
		}else {
			System.out.println("No found");
		}
		
	}

}
