package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class BinaryWord 
{

	public static void main(String[] args) 
	{
		String stringList[]= new String[]{"amit","bhoomi","janvi","diya","tiya"};
		String stringFind="amit";
		int lowest=0;
		int highest=stringList.length;
		int middle=0;
		//System.out.println("1");
		UtilityAlgorithm.BinaryWord(stringList, stringFind, lowest, highest);

    }

}