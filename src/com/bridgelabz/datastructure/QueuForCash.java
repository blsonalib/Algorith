package com.bridgelabz.datastructure;

public class QueuForCash 
{
	static Object[] queue = new Object[40];
	static int front;
	static int rear;
	static int size;

	public static void enQueue(int data)
	{
		queue[rear] = data;
		rear = (rear + 1)% 5;
		size = size + 1;
		if (isFull()) 
		{
 	      System.out.println("Queue is full");
		}
	}
	
	public static int deQueue()
	{
		@SuppressWarnings("unchecked")
		int data = (int) queue[front];
		if (!isEmpty()) 
		{
			front = (front + 1) % 5;
			size = size - 1;
		} 
		else 
		{
		
		}

		return data;
	}

	
	public void show() 
	{
		int length = queue.length;
		int count = rear;
		if (isFull()) 
		{
			while (length > 0) 
			{
				System.out.print(queue[count] + " ");
				count++;
				if (count == 5) 
				{
					count = 0;
				}
				length--;
			}
		}
		else 
		{
			for (int i = 0; i < size; i++)
			{
				System.out.print(queue[(front + i) % 5] + " ");
			}
		}
	}
			
	public static int getSize()
	{
		return size;
	}
			
	public static boolean isFull() 
	{
		return getSize() == 5;

	}
		
	public static boolean isEmpty() 
	{
		return getSize() == 0;
	}

}
