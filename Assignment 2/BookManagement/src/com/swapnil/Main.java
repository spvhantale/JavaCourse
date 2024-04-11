package com.swapnil;

public class Main {

	public static void main(String[] args) {
		Library library=new Library();
		library.addBook(1, "Java Developers");
		library.addBook(2, "DSA Developers");
		library.addBook(3, "Spring Developers");
		library.addMember("Swapnil");
		library.addMember("Ranjit");
		library.addMember("Kunal");
		
		try {
			library.checkoutBook("Swapnil", 1);
			library.checkoutBook("Ranjit", 2);
			library.checkoutBook("Kunal", 1);
		} catch (BookNotAvailableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		};
		try {
			library.returnBook(1);
		} catch (BookNotAvailableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		library.printCheckoutHistory();
		library.printSortedTitles();
		library.printSortedBooksById();
		
	}

}
