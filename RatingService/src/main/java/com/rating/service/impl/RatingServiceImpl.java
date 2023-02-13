package com.rating.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.service.entities.Rating;
import com.rating.service.repository.RatingRepository;
import com.rating.service.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingrepo;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		String randomId=UUID.randomUUID().toString();
		rating.setRatingId(randomId);
		return ratingrepo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingrepo.findAll();
	}

	@Override
	public List<Rating> ratingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingrepo.getRatingByUserId(userId);
	}

	@Override
	public List<Rating> ratingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingrepo.getRatingByHotelId(hotelId);
	}

//	@Override
//	public String deleteRating(String rating) {
//		
//		try
//		{
//			 ratingrepo.deleteByRating(rating);
//			return "deleted";
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return "not deleted";
//		}
//	}
//
//	@Override
//	public Rating updateRatings(Rating rating) {
//		// TODO Auto-generated method stub
//		return ratingrepo.save(rating);
//	}

//	@Override
//	public List<Rating> getSingleRating(Rating id) {
//		// TODO Auto-generated method stub
//		return ratingrepo.findById(id);
//	}

	

}
