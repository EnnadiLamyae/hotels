package org.simple.crud.entities;

public class Review {
	
	private String username;
	private int rating;
	private boolean approved;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(String username, int rating, boolean approved) {
		super();
		this.username = username;
		this.rating = rating;
		this.approved = approved;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	
}
