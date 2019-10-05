package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class NewtonMethod 
{

	public static void main(String[] args) 
	{
		double c=Double.parseDouble(args[0]);
		double epsilon=1e-15;
		double t=c;
		System.out.println(+t);
		UtilityAlgorithm.NewtonMethod(c, epsilon, t);
	}

}
