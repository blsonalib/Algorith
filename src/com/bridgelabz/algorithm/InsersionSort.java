package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.utility.UtilityAlgorithm;

public class InsersionSort 
{

	public static void main(String[] args) 
	{
		int i=1,j;
		String key=null;
		String array[] ={"bali","anna","jiya","kiya","priya","neha"};
		System.out.println(Arrays.toString(array));
		UtilityAlgorithm.InsertionSort(array, key);
	}
}