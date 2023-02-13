package com.hotel.service.service;

import java.util.List;

import org.apache.catalina.User;

import com.hotel.service.entities.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getSingleHotel(String hotelId);
	
	String deleteHotel(String hotelId);
	
	Hotel updateHotel(Hotel hotel);
}
