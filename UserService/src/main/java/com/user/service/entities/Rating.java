package com.user.service.entities;

public class Rating {

	private String ratingId;
	private int rating;
	private String feedback;
	private String hotelId;
	private String userId;
	
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rating(String ratingId, int rating, String feedback, String hotelId, String userId) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.feedback = feedback;
		this.hotelId = hotelId;
		this.userId = userId;
	}

	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
