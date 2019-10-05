package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class EuclideanDistance 
{

	public static void main(String[] args) 
	{
//		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=Integer.parseInt(args[0]); //scanner.nextInt();
		int y= Integer.parseInt(args[1]);//scanner.nextInt();
		double sum1=0.0,sum2=0.0,distance=0.0;
		Utility.EuclideanDistance(x, y, sum1, sum2, distance);
					
	}

}
