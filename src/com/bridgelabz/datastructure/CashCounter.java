package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class CashCounter {

	
		public static void main(String[] args) 
		{
			int balance=0;
			boolean flag=true;
			
			System.out.println("Enter how many people in the queue : ");
			int people=UtilityD.getInteger();
			UtilityD.cashCounter(people);
		}
	}


