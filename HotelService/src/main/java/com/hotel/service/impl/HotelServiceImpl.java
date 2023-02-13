package com.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.entities.Hotel;
import com.hotel.service.exception.ResourceNotFoundException;
import com.hotel.service.repository.HotelRepository;
import com.hotel.service.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelrepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomId= UUID.randomUUID().toString();
		hotel.setHotelId(randomId);
		return hotelrepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelrepository.findAll();
	}

	@Override
	public Hotel getSingleHotel(String hotelId) {
		// TODO Auto-generated method stub
		return hotelrepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException ("user not exit on server"+hotelId));
	}

	@Override
	public String deleteHotel(String hotelId) {
		// TODO Auto-generated method stub
		try
		{
			hotelrepository.deleteById(hotelId);
			return "user deleted successfully ";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "user not avliable";
		}
	}

	@Override
	public Hotel updateHotel(Hotel hotelId) {
		// TODO Auto-generated method stub
		return hotelrepository.save(hotelId);
	}

}
