package com.bridgelabz.datastructure;

public class Dequeue 
{
	static final int MAX=100;
	static char[]array=new char[MAX];
	static int front=-1;
	static int rear=-1;
	static int size;
	
	public Dequeue(int size)
	{
		array=new char[size];
		front=-1;
		rear=-1;
		this.size=size;
	}
	
	public static boolean isFull()
	{
		return((front==0 &&rear==-1) || front==rear+1);
	}
	
	public static boolean isEmpty()
	{
		return(front==-1);
	}
	public static char insertElementAtFront(char element) 
	{
		if(isFull())
		{			
			System.out.println("Queue Overflow");
			return element;
		}
		
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
		{
			front=size-1;
		}
		else
			front=front-1;
		
		return array[front]=element;
	}

	public static char insertElementAtRear(char key) 
	{ 
	if (isFull()) 
		{ 
			System.out.println(" Overflow "); 
			return key; 
		} 

		if (front == -1) 
		{ 
			front = 0; 
			rear = 0; 
		} 

		
		else if (rear == size-1) 
			rear = 0; 

		
		else
			rear = rear+1; 
		array[rear] = key; 
		return key;
	} 

	
	public static char deleteFront() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println("Queue Underflow\n"); 
			return 0 ; 
		} 

		// Deque has only one element 
		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 

			if (front == size -1) 
				front = 0; 

		char ch1 = array[front];
		front = front + 1;
		return ch1; 
	} 

	
	public static char deleteRear() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return 0 ; 
		} 

		// Deque has only one element 
		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
		else if (rear == 0) 
			rear = size-1;
				
		char ch1 = array[rear];
		rear = rear - 1;
		return ch1; 
	} 

	// Returns front element of Deque 
	int getFront() 
	{ 
		// check whether Deque is empty or not 
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return -1 ; 
		} 
		return array[front]; 
	} 

	// function return rear element of Deque 
	int getRear() 
	{ 
		// check whether Deque is empty or not 
		if(isEmpty() || rear < 0) 
		{ 
			System.out.println(" Underflow\n"); 
			return -1 ; 
		} 
		return array[rear]; 
	} 
	
	public static int size()
	{
		return size;
	}	
}
