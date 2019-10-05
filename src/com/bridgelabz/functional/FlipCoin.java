package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
		
		double i=0.0;
		System.out.println("Toss the coin:");
		int flips=Utility.getInteger();
		System.out.println("Number of times coin to be flip:");
		Utility.Flipcoin( flips, i);
	}
	
}