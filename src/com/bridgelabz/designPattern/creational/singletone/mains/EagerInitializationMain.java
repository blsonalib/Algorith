package com.bridgelabz.designPattern.creational.singletone.mains;

import com.bridgelabz.designPattern.singleTone.EagerInitialization;

public class EagerInitializationMain {

	public static void main(String[] args) 
	{
		EagerInitialization obj=EagerInitialization.getInstance();
		obj.showMessage();
        
	}

}
