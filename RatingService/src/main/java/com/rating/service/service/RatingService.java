package com.rating.service.service;

import java.util.List;

import com.rating.service.entities.Rating;

public interface RatingService {

	Rating createRating(Rating rating);
	
	List<Rating> getAllRatings();
	
//	List<Rating> getSingleRating(String id);
	
	List<Rating> ratingByUserId(String userId);
	
	List<Rating> ratingByHotelId(String hotelId);
	
	
//	String deleteRating(String rating);
//	
//	Rating updateRatings(Rating rating);
	

	
}
