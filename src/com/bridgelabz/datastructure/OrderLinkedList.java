package com.bridgelabz.datastructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class NodeNumber<T extends Comparable<T>>
{
	T data;
	NodeNumber<T> next;

}

public class OrderLinkedList<T extends Comparable<T>> 
{
	
	NodeNumber<T> head;
	
	public void append(T data)
	{
		NodeNumber<T> node= new NodeNumber<>();
		 node.data=data;
		 node.next=null;
				 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 NodeNumber<T> current = head;
			 NodeNumber<T> temp=null;
			 
			 while(current!=null && (current.data.compareTo(node.data))<0)
			 {
				 temp=current;
				 current=current.next;
			 }
			 node.next=current;
			 temp.next=node;
			
		 }
		
	}
	
	  //@SuppressWarnings("rawtypes")
	public void insertAtStart(T data) 
	  {
		NodeNumber <T>node = new NodeNumber<>();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;
	  
	  }
	  
	  public void insert(T data,int index) 
	  {
		  //@SuppressWarnings("rawtypes")
		NodeNumber <T>node = new NodeNumber<>();
		node.data = data;
		node.next = null;

		//@SuppressWarnings("rawtypes")
		NodeNumber<T> n = head;

		if (index == 0) 
		{
			insertAtStart(data);
		}
		else
		{
			for (int i = 0; i < index - 1; i++)
			{
				n = n.next; 
			}
	  		node.next=n.next; 
			n.next=node;
		}
	  }
	  
	  public void remove(int index) 
	  {
		  NodeNumber <T>n =head;
		  NodeNumber<T> n1=null;
	  	  for(int i=0;i<index-1;i++) 
	  	  {
	  		  n=n.next; 
		  }
	  	  n1=n.next; 
	  	  n.next=n1.next; 
	  }
	    
	  public void show() 
	  { 
		 // @SuppressWarnings("rawtypes")
		NodeNumber<T> node = head;

		while (node.next != null) 
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	  }
	  
	public void writeOnFile() 
	{
		readFile();
		NodeNumber<T> n = head;
		String first = " ";
		while (n.next != null) 
		{
			first = first.trim() + " " + n.data.toString().trim();
			n = n.next;
		}
		first = first.trim() + " " + n.data.toString().trim();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/userq/BridgelabzSonali/Newjavaproject/src/com/bridgelabz/files/orderlist.txt"))) 
		{
			writer.write(first);
			writer.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public int search(int[] s, int item) 
	{
		int start = 0;
		int end = s.length - 1;
		while (start <= end) 
		{
			int middle = (start + end) / 2;
			if (s[middle]==item) 
			{
				return middle;
			}
			else if (item > s[middle]) 
			{
				start = middle + 1;
			} 
			else
			{
				end = middle - 1;
			}
		}
		return -1;
	}
	 
	public boolean isEmpty() 
	{
		if (head == null)
		{
			return true;
		}
	  return false; 
	}
		
	
	public  int size() 
	{
		int counter = 1;
		NodeNumber<T> n = head;
		while (n.next != null) 
		{
			counter++;
			n = n.next;
		}
		return counter;
	}

	public int index(String item) 
	{
		int pos = 0;
		NodeNumber<T> n = head;
		while (n.next != null)
		{
			if (n.data.equals(item)) 
			{
				return pos;
			} 
			else
			{	
				n = n.next;
				pos++;
			}
		}
		pos--;
		return pos;
	}
	  
	public int[] readFile()
	{
		try 
		{
			File f= new File("/home/userq/BridgelabzSonali/Newjavaproject/src/com/bridgelabz/files/orderlist.txt");
			Scanner sc= new Scanner(f);
			int count=0;
			while(sc.hasNextInt())
			{
				count++;
				sc.nextInt();
			}
			int[] array= new int[count];
			Scanner s= new Scanner(f);
			for(int i=0;i<array.length;i++)
			{
				array[i]=s.nextInt();
			}
			return array;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return  null;
		}
	}

	public int[] sort(int[] array)
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			int flag=0;
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		return array;
	}
}
