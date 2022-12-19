package com.mavensample1.hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
@Id
	private int carmodel;
	private String carname;
	private int carprice;
	
	
	
	public Car() {
		super();
		
	}
	public int getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(int carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarprice() {
		return carprice;
	}
	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}
	@Override
	public String toString() {
		return "Car [carmodel=" + carmodel + ", carname=" + carname + ", carprice=" + carprice + "]";
	}
	
	
	
	
	
	
	
	
}
