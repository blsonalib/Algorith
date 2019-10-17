package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class AnagramQueue {

	public static void main(String[] args)
	{
		QueueLinkedList queue=new QueueLinkedList();
		int result[]=UtilityD.primeAnagram(1000);
		for(int i=result.length-1;i>=0;i--)
		{
			queue.enQueue(result[i]);}
			System.out.println(result);
		    queue.display();
		
	       }
	}


