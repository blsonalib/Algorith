package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TripletsIsZero {

	public static void main(String[] args) 
	{
		int array[]= {0,-1,2,-3,1,4,5,9,-3,8,2};
		boolean found=false;
		int n=array.length;
		Utility.TripletsIsZero(array, found, n);
	}
}
