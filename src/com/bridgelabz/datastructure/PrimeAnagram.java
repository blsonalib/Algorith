package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class PrimeAnagram {

	public static void main(String[] args) {
		
		int res[]=UtilityD.primeAnagram(1000);
		System.out.println("prime anagram pairs are:");
		for(int i=0;i<158;i=i+2)
		{
			System.out.print(res[i]+" & "+res[i+1]+"\n");
	}

}}
