package com.bridgelabz.algorithm;

import java.util.Scanner;

//import com.bridgelabz.utility.UtilityAlgorithm;

public class VendingMachine 
{

	  	static int i=0;
	  	static int total=0;
     	static int[] notes = { 1000,500,100,50,10,5,2,1};
	  	static int money;

	  	
	  	public static  int calculate(int money,int[]notes )
	  	{
	  		
	        int rem;
			if(money==0)
			{
				return -1 ;
			}
			else
			{
				if(money>=notes[i])
				{
					// logic for Calculating The notes
					int calculateNotes =money/notes[i];
					rem = money%notes[i];
					money =rem;
					total += calculateNotes;
					System.out.println(notes[i]+   " Notes -->> " +calculateNotes );
				}
				i++;
				return calculate(money, notes);
			}
		}
		public static void main(String[] args)
		{
	        Scanner scanner=new Scanner(System.in);

			//ask the user enter the money
			System.out.print("Enter the Amount:");
			money =scanner.nextInt();

			//VendingMachine.calculate(money,notes);
			System.out.println("Total Number of Notes are :"+total);
		}
	}


//}

