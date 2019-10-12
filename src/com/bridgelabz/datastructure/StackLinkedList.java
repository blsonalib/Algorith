package com.bridgelabz.datastructure;

public class StackLinkedList
{
	private class Node 
	{ 
		  
        int data; 
        Node link; 
    } 
    
    Node top; 
    // Constructor 
    StackLinkedList() 
    { 
        this.top = null; 
    } 
  
  
    @SuppressWarnings("unused")
	public void push(int x) // insert at the beginning 
    { 
        Node temp = new Node(); 
  
      
        temp.data = x; 
  
        temp.link = top; 
  
        top = temp; 
        if (temp == null)     
        { 
           System.out.print("Heap Overflow"); 
          return; 
        } 
   
    } 
  
    public boolean isEmpty() 
    { 
        return top == null; 
    } 
  
    public int peek() 
    { 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return -1; 
        } 
    }


	public void display() 
	{
		if (top == null) 
		{ 
			System.out.printf("Stack Underflow"); 
		} 
		 else 
		 { 
				Node temp = top; 
				while (temp != null) 
				{ 
	                        
				// print node data 
				  int num=temp.data;
				  System.out.print(num+" "); 

				   temp = temp.link; 
				} 
	   } 
	}
}
