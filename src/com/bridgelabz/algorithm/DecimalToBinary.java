package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class DecimalToBinary 
{

	public static void main(String[] args) 
	{
		int number,i=0;
		int binary[]=new int[100];
		System.out.println("Enter decimal number:");
		
		number=UtilityAlgorithm.getInteger();
		UtilityAlgorithm.DecimalToBinary(binary, number, i);
	}

}
