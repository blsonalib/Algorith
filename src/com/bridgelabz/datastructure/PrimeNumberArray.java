package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

       public class PrimeNumberArray 
{

	public static void main(String[] args)
	{

		System.out.print("\t\t\t");
		for (int x = 1; x <= 25; x++) 
		{
			System.out.print("col" + x + "\t");
		}
		System.out.println("\n");

		int prime[][] = UtilityD.PrimeNumberArray(1000);

		for (int k = 0; k < 10; k++) 
		{
			System.out.print("range:" + (k * 100 + 0) + "-" + (k * 100 + 100) + "\t");
			System.out.print(" row" + (k + 1) + "-->  ");
			for (int l = 0; l < 25; l++) 
			{
				System.out.print(prime[k][l] + "\t");
			}
			System.out.println();
		}
	}
	}
	

