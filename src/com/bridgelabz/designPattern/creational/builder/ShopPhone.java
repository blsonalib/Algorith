package com.bridgelabz.designPattern.creational.builder;

public class ShopPhone 
{

	public static void main(String[] args)
	{
		Phone phone= new PhoneBuilder().setOs("Anroid").setBattery(3000).getPhone();
		System.out.println(phone);
	}

}
