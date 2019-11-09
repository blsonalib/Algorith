package com.bridgelabz.designPattern.creational.singletone.mains;

import com.bridgelabz.designPattern.singleTone.LazyInitialization;

public class LazyInitializedMain 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		LazyInitialization obj= LazyInitialization.getInstance();
		@SuppressWarnings("unused")
		LazyInitialization obj1= LazyInitialization.getInstance();
		
	}

}
