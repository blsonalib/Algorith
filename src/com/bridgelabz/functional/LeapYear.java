package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear 
{

	public static void main(String[] args)
	{
		int year;
		boolean flag=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=scanner.nextInt();
	 Utility.LeapYear(year, flag);
	}
	
}
