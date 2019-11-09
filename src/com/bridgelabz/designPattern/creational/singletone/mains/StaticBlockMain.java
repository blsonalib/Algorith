package com.bridgelabz.designPattern.creational.singletone.mains;

import com.bridgelabz.designPattern.singleTone.StaticBlockSingleTone;

public class StaticBlockMain 
{

	public static void main(String[] args) 
	{
		StaticBlockSingleTone obj=StaticBlockSingleTone.getInstance();
		obj.show1();
		
	}

}
