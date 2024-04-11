package com.swapnil;

public class Multimedia extends Resource implements Search{
	private String format;

	public Multimedia(String title,String format) {
		super(title);
		this.format=format;
	}

	@Override
	public void searchBook(String query) {
		
		if(getTitle().contains(query) || format.contains(query)) {
			System.out.println("Multimedia found: "+getTitle()+" Publisher: "+format);
		}else {
			System.out.println("No found");
		}
		
	}

}
