package com.swapnil;

public abstract class Resource {

	private String title;
	private Boolean checkOut;
	
	public Resource(String title) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.checkOut=false;
	}
	
	public void checkOut() {
		if(!checkOut) {
			checkOut=true;
			System.out.println(title+" has been checked out.");
		}else {
			System.out.println(title+" is already checked out.");
		}
	}
	
	public void returnResource() {
		if(checkOut) {
			checkOut=false;
			System.out.println(title+" has been returned");
		}else {
			System.out.println(title+" is not checked out");
		}
	}

	public String getTitle() {
		return title;
	}

	public Boolean getCheckOut() {
		return checkOut;
	}
	
	
	
	
}
