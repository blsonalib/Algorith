package com.bridgelabz.datastructure;


	public class Queue<T>
	{
		static Node head;
		static Node front;
		static Node rare;
		static int size=0;

		public static  void enQueue(int data) 
		{
			Node node= new Node();
			node.data=data;
			node.next=null;
			if(isEmpty())
			{
				front=node;
				rare=node;
			}
			else
			{
				rare=node;
				rare=rare.next;
			}
		}

		public static  int deQueue()
		{
			int node=front.data;
			if(front==null)
			{
				rare=null;
			}
			front=front.next;
			size--;
	        System.out.println("Size Of Queue : "+size);
			return node;
		}

		public static boolean isEmpty()
		{
			return (front==null);
		}
		
		public static  int size() 
		{
			
			size++;
			return size;
		}
		
		public void display()
		{
			Node tnode=front;
			while(tnode!=null)
			{
				System.out.println(tnode.data);
				tnode=tnode.next;
			}
		}
		public void displayQueue()
		{
			Node tnode=front;
			while(tnode.next!=null)
			{
				System.out.println(tnode.data);
				tnode=tnode.next;
			}

}