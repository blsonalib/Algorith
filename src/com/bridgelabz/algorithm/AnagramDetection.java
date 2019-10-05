package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityAlgorithm;

public class AnagramDetection
{

	public static void main(String[] args) 
	{
		String string1,string2;
		int length,i=0,j=0,found=0,notfound=0;
		
		System.out.println("Enter the first string:");
		string1=UtilityAlgorithm.getString();
		System.out.println("Enter the second string:");
		string2=UtilityAlgorithm.getString();
		int length1=string1.length();
		int length2=string2.length();
		UtilityAlgorithm.AnagramDetection(string1, string2, length1, length2, length2, i, j, found, notfound);
		
		
	}

}
