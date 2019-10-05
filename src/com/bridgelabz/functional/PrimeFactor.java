package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactor 
{

	public static void main(String[] args) 
	{
     	int n;
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    n= scanner.nextInt();
	    Utility.primeFactor(n);
	}

}
