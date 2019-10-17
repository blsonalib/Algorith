package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class OrderedRunner 
{

	public static void main(String[] args)
	{
		OrderLinkedList<Integer> linkedList=new OrderLinkedList<Integer>();
		int []a=linkedList.readFile();
		int[] array=linkedList.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+array[i]);
		}
		for(int j=0;j<a.length;j++)
		{
			linkedList.append(array[j]);
		}
		UtilityD utility=new UtilityD();
		System.out.println("Enter number to search element: ");
		int i=utility.getInteger();
		
		int result=linkedList.search(array, i);
		
		if(result==-1)
		{
			System.out.println("Element not found");
			linkedList.append(i);
			linkedList.show();
			int size1=linkedList.size();
			System.out.println("Size of linked list is : "+size1);
			linkedList.writeOnFile();
			System.out.println("Successfully written on file!");
			
			
		}
		else
		{
			System.out.println("Element found at : "+result);
			linkedList.remove(result);
			System.out.println("Successfully deleted element!");
			linkedList.show();
			linkedList.writeOnFile();
			int size2=linkedList.size();
			System.out.println("Size of linked list is : "+size2);
			
		}
		
	}

}
