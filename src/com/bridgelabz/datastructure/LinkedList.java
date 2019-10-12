package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class LinkedList
{
	 static Node head;
     static String element;
	 class Node
	 {
		public final Node nextNode = null;
		String data;
		 Node next;
	
	 }
	 
	 public void insert(String i)
	 {
		
		Node node=new Node();
		node.data=i;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
		  Node n=head;      //temperory node
		  while(n.next!=null)
		  {
			  n=n.next;
		  }
		  n.next=node;
		}
	 }
	 
	 /**
	  * insert element at start
	  * @param data
	  */
	 public void insertAtstart(String data)
	 {
		 Node node=new Node();
			node.data=data;
			node.next=null;
			
			node.next=head;
			head=node;
			
	 }
	 

	 
	 /**
	  * insertAtposition 
	  * @param data
	  * @param index
	  */
	 public void insertAtpos(String data,int index)
	 
	 {
		 Node node=new Node();
			node.data=data;
			node.next=null;
			
			Node node1=head;
			 
			
			if(index==0)
			{
				insertAtstart(data);
			}
			else
			{
				for(int i=0;i<index-1;i++)
				{
					node1=node1.next;
				}
				
				node.next=node1.next;
				node1.next=node;	
			}
	}
	 /**
	  * delete node from Linkedlist
	  * @param index
	  */
	 public void deleteAtPos(int index)
	 {
		 if(index==0)
		{
		   head=head.next;		
		}
		 else
		 {
			Node node = head;
			Node node1=null;
			for(int i=0;i<index-1;i++)
			{
				node1=node1.next;
			}
			
			node1=node.next;
			node.next=node1.next;
		 }
	 }
	 
	 /**
	  * delete node from linked list
	  * @param element
	  */
	 
	 public  void deleteData(String data)  //method to remove node
	 {
	 if(head==null)
	 {
	 System.out.println("Empty List");
	 return;
	 }
	 else
	 {
	 Node temp=head;
	 Node temp1=head.next;
	 while(!temp1.data.equals(data))
	 {
	 temp=temp.next;
	 temp1=temp1.next;
	 }
	 if(temp1.data.equals(data))
	 {
	 temp.next=temp1.next;
	 }
	 }


	 }
	 
	 public  void deleteNode(String element)
	 {
		Node temp = head, prev = null;		
		if(temp!= null && temp.data==element)
	{
			head=temp.next;
			return;
		}
	
	while(temp!=null && temp.data!=element)
		{
		prev=temp;
			temp=temp.next;
			
	}
	if(temp==null)
			return ;
	prev.next=temp.next;
	
		
	 }	  
	 /**
	  * search element from linkedlist
	  * @param data
	 * @return 
	  */
	 
	  public boolean searchNode(String data)
	  {  
	        Node node = head;
	        int status=0;
	        boolean flag=false;  
	       
	        while(node != null) 
	            {  

	               String s=node.data;
	                if(s.equals(data)) 
	                 {
	                	flag=true;
	             
	                    break; 
	                }  
	                else
	                {
	                    node = node.next;
	                    flag=false;
	                }
	        	    status++;
	            }
	           if(flag==true)
	            {
	        	   System.out.println("Element found at+ "+ status);
	        	   remove(status);
	            	return true;
	            }
	            else
	            {
	            	insert(data);
	            	return false;
	            }
	        }
			
	   /**
	    * remove function
	    * @param status
	    */
	  public static void remove(int status)
	  {
		  if(status==1)
		  {
			  head=head.next;
		  }
		  else
		  {
			  Node n=head;
			  Node n1=null;
			  for(int i=1;i<status-1;i++)
			  {
				  n=n.next;
			  }
			  n1=n.next;
			  n.next=n1.next;
		  }
	  }
	  
	  public static void append(String data)
	  {
		  Node node2=head;
			 node2.data=data;
			 node2.next=null;
			 
			 
			 if(head==null)
			 {
				 head=node2;
			 }
			 else
			 {
				 Node n=head;
				 while(n.next!=null)
				 {
					 n=n.next;
				 }
				 n.next=node2;
			 }
			
	  }
	  
	  public void writeOnFile()
		{
		  	readFile();
		  	
			Node n=head;
			
			String first=" ";
			
			while(n.next!=null)
			{
				first=first.trim()+" "+n.data.toString().trim();
				n=n.next;
			}
			first=first.trim()+" "+n.data.toString().trim();
			
			try(BufferedWriter writer= new BufferedWriter(new FileWriter("/home/userq/BridgelabzSonali/Newjavaproject/src/com/bridgelabz/files/Unorder.txt"))) 
			{
				
			writer.write(first);
			writer.close();
			
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}


	private static void readFile()
	{
		String line = " ";
		String words[]=new String[10];
		int count = 0;
		
		FileReader fileReader;
		try {
			fileReader = new FileReader("/home/userq/BridgelabzSonali/Newjavaproject/src/com/bridgelabz/files/Unorder.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			 //Gets each line till end of file is reached
			try {
				while((bufferedReader.readLine())!=null)
				{
					//Splits each line into words
					words=line.split(",");
					 //Counts each word
					count=count+words.length;
				}
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			}catch(FileNotFoundException e) 
		    {
				e.printStackTrace();
			}
		}
	public int lengthOfLinkedList()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	public String pop()
	{
		String s=null;
		if(isEmpty())
			{
			System.out.println("list is Empty");
			}
		else
			
			{
				int i=0;
				Node n= head;
			
				
				while(n.next!=null)
				{
					n=n.next;
					i++;
				}
				s= n.data;
				
				remove(i);
			}
			
			return s;
		}
		
		public String pop(int index)
		{
			String s=" ";
			int count=0;
			
			Node n= head;
			
			for(int i=0;i<index;i++)
			{
				n=n.next;
				count++;
			}
			s=(String) n.data;
			
			remove(count);
			
			return s;
			
		}

	  public int size()
		{
			int counter=0;
			
			Node n= head;
			
			while(n.next!=null)
			{
				counter++;
				n=n.next;
			}
			
			return counter;
		}
	  
	  public static boolean isEmpty()
		{
			if(head==null)
			{
				return true;
			}
			
			return false;
		} 
	  
	  /**
	   * Display Linked List
	   */
	 
		public void show()
		 {
			 Node node=head;
			 while(node.next!=null)
			 {
				 System.out.println(node.data);
				 node=node.next;
			 }
			 System.out.println(node.data);
			
		 }




}
