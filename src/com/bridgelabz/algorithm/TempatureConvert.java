package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class TempatureConvert 
{

	public static void main(String[] args)
	{
		 double celsius=0,fahreheit=0;
		 System.out.println("Enter the choice of temperature conversion :");
		 int choice=UtilityAlgorithm.getInteger();
		 UtilityAlgorithm.TemperatureConvert(fahreheit, celsius,choice);
		}
	}


