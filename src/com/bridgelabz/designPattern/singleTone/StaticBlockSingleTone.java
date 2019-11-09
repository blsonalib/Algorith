package com.bridgelabz.designPattern.singleTone;

public class StaticBlockSingleTone 
{
	public static StaticBlockSingleTone obj;
	private StaticBlockSingleTone()
	{
		
	}
	static
	{
		try
		{
			obj=new StaticBlockSingleTone();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	public static StaticBlockSingleTone getInstance()
	{
		return obj;
	}
	public void show1()
	{
		System.out.println("Static block Sigletone");
	}
	
	
}
