package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class QuadraticEquation 
{

	public static void main(String[] args) 
	{
		
		int a,b,c;
		System.out.println("Enter the value of a,b and c:");
		a=Utility.getInteger();
		b=Utility.getInteger();
		c=Utility.getInteger();
		double Root1=0,Root2=0,delta=0;
		Utility.QuadraticEquation(a, b, c, Root1, Root2, delta);
	}

}
