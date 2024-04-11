package com.swapnil;

public class LibaraySystem {

	public static void main(String[] args) {
		Book book=new Book("Java", "Swapnil");
		Journal journal=new Journal("Java Journal", "Tech Publicatons");
		Multimedia multimedia=new Multimedia("Java Tutorial", "Video");
		book.checkOut();
		book.checkOut();
		book.returnResource();
		
		book.searchBook("Java");
		journal.searchBook("Java");
		multimedia.searchBook("Java");
	}

}
