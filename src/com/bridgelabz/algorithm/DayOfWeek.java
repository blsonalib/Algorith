package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class DayOfWeek
{

	public static void main(String[] args)
	{
		
		int day=Integer.parseInt(args[0]);
		
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		System.out.println("date"+day+":month"+month+":year"+year+":");
		boolean flag=true;
		UtilityAlgorithm.validateDate(month, day, year);
	}

}
