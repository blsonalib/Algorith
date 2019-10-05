package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill 
{

	public static void main(String[] args) 
	{
		double temperature=Double.parseDouble(args[0]);
		double speed=Double.parseDouble(args[1]); 
		double windchill=0;
		System.out.println("Enter the temperature and speed :");
		Utility.WindChill(temperature, speed, windchill);
		
	}

}
