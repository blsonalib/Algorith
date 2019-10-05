package com.bridgelabz.functional;

public class SecondLargest
{

	public static void main(String[] args) 
	{
		int arr[]= {2,4,5,6,10,11,15};
		int larg1,larg2;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}
		larg1=arr[0];
		for(int i=0;i<arr.length;i++)
		
		{
		 if(arr[i]>larg1)
		 {
			 larg1=arr[i];
		 }
		}
		larg2=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>larg2&&arr[i]<larg1)
			{
				larg2=arr[i];
			}
		}
		System.out.println("Second largest number:"+larg2);
	}

}
