package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
		float value=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scanner.nextInt();
		System.out.print("The harmonic series:");
		Utility.HarmonicNumber(value, number);

	}
}	
	
	
