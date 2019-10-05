package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class MonthlyPayment 
{

	public static void main(String[] args) 
	{
		int principle=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int rateOfInterest=Integer.parseInt(args[2]);
		float payment=0;
		int timePeriod=0;
		int rate=0,numberOfYears=0;
		UtilityAlgorithm.MonthlyPayment(principle, year, rateOfInterest, payment, timePeriod, rate, numberOfYears);
		
	}

}
