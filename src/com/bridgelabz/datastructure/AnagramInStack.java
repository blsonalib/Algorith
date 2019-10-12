package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class AnagramInStack 
{

	public static void main(String[] args) 
	{
		StackLinkedList stack=new StackLinkedList();
		int result[]=UtilityD.primeAnagram(1000);
		for(int i=result.length-1;i>=0;i--)
			stack.push(result[i]);
			System.out.println(result);
			stack.display();
	}
	}


