package com.bridgelabz.designPattern.singleTone;

public class EagerInitialization
{
   
    private static  EagerInitialization obj = new EagerInitialization();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitialization()
    {
    	
    }

    public static EagerInitialization getInstance()
    {
        return obj;
    }
    public void showMessage()
    {
    	System.out.println("Eager singlton design pattern");
    }
}
