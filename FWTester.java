package com.xworkz.sports;

import com.xworkz.sports.constants.FootWareType;
import com.xworkz.sports.footWare.ShoeFootWare;

public class FWTester {
	public static void main(String[] args) {
		ShoeFootWare shoeFootWare = new ShoeFootWare(); 
		shoeFootWare.setBrand("fastrack");
		shoeFootWare.setSize(7);
		shoeFootWare.setPrice(2000);;
		shoeFootWare.setFootWareType(FootWareType.SPORTS);
		shoeFootWare.displayDetails();
		double dis=shoeFootWare.calculateDiscount();
		System.out.println(dis);

	}

}
