package com.bridgelabz.designPattern.singleTone;

public class EnumSingleton 
{

	public static void main(String[] args)
	{
		Xyz obj1=Xyz.INSTANCE;
		obj1.i=5;
		obj1.show();
		Xyz obj2=Xyz.INSTANCE;
		obj2.i=6;
		obj2.show();
		
	}
	enum Xyz
	{
		INSTANCE;
		int i;
		public void show()
		{
			System.out.println(i);
		}
	}

}
