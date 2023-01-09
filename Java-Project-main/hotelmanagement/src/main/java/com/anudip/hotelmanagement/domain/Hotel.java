package com.anudip.hotelmanagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Hotel {
		@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long contact;
	    private String CustomerName;
	    private String Roomtype;
	    private int bookingfees;
	public Hotel() {
	 
	}
	 public Long getContact() {
		return contact;
	}
	  public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getRoomtype() {
		return Roomtype;
	}
	public void setRoomtype(String roomtype) {
		Roomtype = roomtype;
	}
	public int getBookingfees() {
		return bookingfees;
	}
	public void setBookingfees(int bookingfees) {
		this.bookingfees = bookingfees;
	}

	
	
}
