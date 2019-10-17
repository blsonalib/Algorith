package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class PrimeAnagrameusingQueue 
{

	public static void main(String[] args)
	{
	 QueueLinkedList queue=new QueueLinkedList();
	 int arr[]=UtilityD.primeAnagram(1000);
	for(int i=arr.length-1;i>=0;i--) 
		queue.enQueue(arr[i]);		
	 System.out.println(arr);
		queue.display();
	

	}

}
