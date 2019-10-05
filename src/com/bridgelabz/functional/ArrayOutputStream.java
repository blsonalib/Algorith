package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class ArrayOutputStream {

	public static void main(String[] args) 
	{
		int array[][]=new int [3][3];
		int row,column,i=0,j=0;
		System.out.println("Enter the row values:");
		row=Utility.getInteger();
		System.out.println("Enter the column value:");
		column=Utility.getInteger();
		System.out.println("Enter"+" "+row*column+" "+"is:");
		Utility.ArrayOutputStream(array,row, column, i, j);
	}

}
