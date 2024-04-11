package com.swapnil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Library {

	private ArrayList<Book> books;
	private Vector<String> members;
	private LinkedList<String> waitlist;
	private Stack<Book> returnedBooks;
	private HashSet<String> uniqueMembers;
	private LinkedHashSet<Book> borrowedBooks;
	private TreeSet<String> sortedTitles;
	private HashMap<Integer, Book> bookMap;
	private LinkedHashMap<Integer, Book> checkoutHistory;
	private TreeMap<Integer, Book> sortedBooksById;

	public Library() {
		this.books = new ArrayList<>();
		this.members = new Vector<>();
		this.waitlist = new LinkedList<>();
		this.returnedBooks = new Stack<>();
		this.uniqueMembers = new HashSet<>();
		this.borrowedBooks = new LinkedHashSet<>();
		this.sortedTitles = new TreeSet<>();
		this.bookMap = new HashMap<>();
		this.checkoutHistory = new LinkedHashMap<>();
		this.sortedBooksById = new TreeMap<>();
	}

	public void addBook(int id, String title) {
		Book book = new Book(id, title);
		books.add(book);
		bookMap.put(id, book);
		sortedTitles.add(title);
		sortedBooksById.put(id, book);
	}

	public void addMember(String member) {
		if (uniqueMembers.add(member)) {
			members.add(member);
		} else {
			System.out.println("Member already exists.");
		}
	}

	public void checkoutBook(String member, int bookId) throws BookNotAvailableException {
		Book book = bookMap.get(bookId);
		if (book != null && book.isAvailable()) {
			book.setAvailable(false);
			borrowedBooks.add(book);
			checkoutHistory.put(bookId, book);
			System.out.println("Book '" + book.getTitle() + "' checked out by " + member);
		} else {
			waitlist.add(member);
			throw new BookNotAvailableException("Book is not available for checkout.");
			
		}
	}

	public void returnBook(int bookId) throws BookNotAvailableException {
		Book book = bookMap.get(bookId);
		if (book != null && !book.isAvailable()) {
			book.setAvailable(true);
			returnedBooks.push(book);
			borrowedBooks.remove(book);
			System.out.println("Book '" + book.getTitle() + "' returned.");
			if (!waitlist.isEmpty()) {
				String nextMember = waitlist.poll();
				System.out.println("Book '" + book.getTitle() + "' checked out by " + nextMember + " from waitlist.");
				checkoutBook(nextMember,bookId);
			}
		} else {
			System.out.println("Invalid book ID");
		}
	}

	public void printCheckoutHistory() {
		System.out.println("Checkout History:");
		for (Map.Entry<Integer, Book> entry : checkoutHistory.entrySet()) {
			System.out.println("Book ID: " + entry.getKey() + ", Title: " + entry.getValue().getTitle());
		}
	}

	public void printSortedTitles() {
		System.out.println("Sorted Titles:");
		for (String title : sortedTitles) {
			System.out.println(title);
		}
	}

	public void printSortedBooksById() {
		System.out.println("Sorted Books by ID:");
		for (Map.Entry<Integer, Book> entry : sortedBooksById.entrySet()) {
			System.out.println("Book ID: " + entry.getKey() + ", Title: " + entry.getValue().getTitle());
		}
	}
}
