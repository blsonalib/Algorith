package com.bridgelabz.datastructure;

public class Stack
{
	
	static int MAX=1000;
	static int top=-1;
	static char[]items=new char[MAX];
	
	/**Inserting data into stack
	 * 
	 * @param c
	 */
public	static void push(char c) 
	{
		if(top==MAX-1)
		{
			System.out.println("Stack if full");
		}
		else
		{
			items[++top]=c;
		}
		
	}
	
	 /**
     * Purpose: method to check if stack is empty or not
     * @return
     */
	public static boolean isEmpty() 
	{
		return top==-1;
	}
	
	/**Deletion of data from stack
	 * 
	 * @param c
	 */
	public static char pop(char c) 
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return '\0';
		}
		else
		{
			char element=items[top];
			top--;
			return element;
		}
	}
	public static int peek() 
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x=items[top];
			return x;
	}}}
		


