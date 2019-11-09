package com.bridgelabz.designPattern.singleTone;

public class TheadSafeSingleTone 
{
	public static TheadSafeSingleTone obj;
	private TheadSafeSingleTone()
	{
		
	}
	public static synchronized TheadSafeSingleTone getInstance()
	{
	 if(obj==null)
	 {
		 obj=new TheadSafeSingleTone();
	 }
	 return obj;
	}
	public void display()
	{
		System.out.println("Thread safe singletone");
	}

}
