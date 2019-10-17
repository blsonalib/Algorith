//package com.bridgelabz.datastructure;
//
//public class StackUsingLinkedList
//{
//
//		public static class Node
//		{ 
//			
//		   int data;
//		   Node link; /* reference variavle Node type*/  
//			} 
//		
//		
//			static Node top;    /* create globle top reference variable */  
//			 
//			StackUsingLinkedList() 
//			{ 
//					StackUsingLinkedList.top = null; 
//			} 
//		                      
//			public static void push(int x)                                
//			{  
//				
//				Node temp = new Node(); 
//				
//				  
//				temp.data = x; 
//
//				temp.link = top; 
//
//				
//				top = temp; 
//			} 
//
//			
//		  public boolean isEmpty() 
//			{ 
//				return top == null; 
//			} 
//		  
//		 
//		 public int peek() 
//	       { 
//			                       // check for empty stack 
//				if (!isEmpty()) 
//				{ 
//					return top.data; 
//					} 
//					else
//					{ 
//					System.out.println("Stack is empty"); 
//					return -1; 
//					} 
//					} 
//
//		 
//			public static void pop() // remove at the beginning 
//			{ 
//				
//				if (top == null) { 
//				System.out.print("\nStack Underflow"); 
//				return; 
//				} 
//
//				// update the top pointer to point to the next node 
//				top = (top).link; 
//			} 
//
//			public static void display() 
//			{ 
//			
//				if (top == null) { 
//				System.out.printf("\nStack Underflow"); 
//						} 
//				else { 
//					Node temp = top; 
//					while (temp != null) { 
//		                        
//					
//					int num=temp.data;
//					System.out.print(num+" "); 
//
//					
//					temp = temp.link; 
//							} 
//						} 
//			} 
//			
//	}
//
//
