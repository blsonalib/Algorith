package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class BinarySearchTree {

	public static void main(String[] args)
	{
		System.out.println("Enter total number of testcases : ");
		double testCases=UtilityD.getDouble();
		while(testCases>0)
		{
			System.out.println("Enter total number of nodes: ");
			double testNodes=UtilityD.getDouble();
			double totalTree=UtilityD.binarySearchTree(testNodes);
			System.out.println(totalTree);
			testCases--;
		}
		System.out.println("Ends");
	}	
	}


