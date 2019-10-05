package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf 
{

	public static void main(String[] args) 
	{
		int number=0,i=2;
		
		System.out.println("Enter the number:");
		number=Utility.getInteger();
		System.out.println("power of 2^"+number+"is:"+Math.pow(number, 2));
		System.out.println();
		System.out.println("The number is:"+number);
		Utility.PowerOf(number, i);
	}

}
 