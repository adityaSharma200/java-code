package com.anudip.hotelmanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.anudip.hotelmanagement.domain.Hotel;
import com.anudip.hotelmanagement.repository.HotelRepository;

public class HotelService implements HotelService1 {


	
	@Autowired
	private HotelRepository hotelrepository;
	
	@Override
	public Hotel saveHotel(Hotel hotel)
	{
		return hotelrepository.save(hotel);
	}
	
	@Override
	public Hotel updateHotel(Hotel hotel)
	{
		Hotel getdata=getHotel(hotel.getContact());
		
		Hotel updateData=new Hotel();
		
		if(getdata != null)
		{
			updateData.setContact(hotel.getContact());
			updateData.setCustomerName(hotel.getCustomerName());
			updateData.setRoomtype(hotel.getRoomtype());
			updateData.setBookingfees(hotel.getBookingfees());
			
			
			
		}
		return hotelrepository.save(updateData);
	}
	
	@Override
	public Hotel getHotel(long contact)
	{
		return hotelrepository.findById(contact).orElseThrow(()->new RuntimeException("Contact not found"));
	}
	
	@Override
	public Boolean deleteHotel(long contact)
	{
		hotelrepository.deleteById(contact);
		
		return true;
	}
	
	
}
