package com.anudip.hotelmanagement.service;

import com.anudip.hotelmanagement.domain.Hotel;

public interface HotelService1 {
	
	Hotel saveHotel(Hotel hotel);
	Hotel updateHotel(Hotel hotel);
	Hotel getHotel(long contact);
	Boolean deleteHotel(long contact);
	
	
	

}
