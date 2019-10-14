package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class CashCounter {

	
		public static <T> void main(String[] args) 
		{
			int balance=1000;
			boolean flag=true;
			
			System.out.println("Enter how many people in the queue : ");
			int people=UtilityD.getInteger();
			UtilityD.cashCounter(people);
		}
	}


