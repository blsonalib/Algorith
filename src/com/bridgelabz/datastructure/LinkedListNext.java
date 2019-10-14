package com.bridgelabz.datastructure;


	public class LinkedListNext<T> 
	{
		
		Object[] queue = new Object[40];
		int front;
		int rear;
		int size;

		public void enQueue(T data)
		{
			queue[rear] = data;
			rear = (rear + 1)% 5;
			size = size + 1;
			if (isFull()) 
			{
	 	  
			}
		}
		
		public T deQueue()
		{
			@SuppressWarnings("unchecked")
			T data = (T) queue[front];
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
				
		public int getSize()
		{
			return size;
		}
				
		public boolean isFull() 
		{
			return getSize() == 5;

		}
			
		public boolean isEmpty() 
		{
			return getSize() == 0;
		}
}
