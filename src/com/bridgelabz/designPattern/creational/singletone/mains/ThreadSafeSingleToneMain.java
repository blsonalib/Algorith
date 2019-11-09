package com.bridgelabz.designPattern.creational.singletone.mains;

import com.bridgelabz.designPattern.singleTone.TheadSafeSingleTone;

public class ThreadSafeSingleToneMain 
{

	public static void main(String[] args) 
	{
		TheadSafeSingleTone obj=TheadSafeSingleTone.getInstance();
		obj.display();
	}

}
