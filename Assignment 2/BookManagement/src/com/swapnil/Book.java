package com.swapnil;

public class Book {

	private int id;
	private String title;
	private boolean available;
	
	
	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
		this.available = true;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", available=" + available + "]";
	}
	
	
	
}
