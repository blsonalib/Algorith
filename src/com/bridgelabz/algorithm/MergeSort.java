package com.bridgelabz.algorithm;

import com.bridgelabz.utility.UtilityAlgorithm;

public class MergeSort
{

	public static void main(String[] args) 
	{
		 String[] Array1= { "jiya", "Priya", "Sonali", "Diya", "Chiya", "Man"};
	        String[] Array2 = { "Mona", "Kirti", "Miya", "Monty", "Zubi" };
	        String[] names = new String[Array1.length + Array2.length];

	      UtilityAlgorithm.mergeSort(Array1);
	       UtilityAlgorithm.mergeSort(Array2);

	       UtilityAlgorithm.mergesort(names, Array1, Array2);

	        UtilityAlgorithm.mergeSort(names);  //Arrays.sort(names);

	        for (String Array3 : names) 
	        {
	            System.out.println(Array3);
	        }
	  }
	
}


