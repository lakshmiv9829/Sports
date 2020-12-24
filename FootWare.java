package com.xworkz.sports.footWare;

import com.xworkz.sports.constants.FootWareType;

public class FootWare {
	private int size;
	private String brand;
	private double price;
	private FootWareType footWareType;
	
	public void protect() {
		System.out.println("invoked");
	}
	public void displayDetails() {
		System.out.println(this.size);
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.footWareType);
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public FootWareType getFootWareType() {
		return footWareType;
	}
	public void setFootWareType(FootWareType footWareType) {
		this.footWareType = footWareType;
	}
	


}
