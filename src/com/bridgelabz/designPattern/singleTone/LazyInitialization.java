package com.bridgelabz.designPattern.singleTone;

public class LazyInitialization 
{
  private static  LazyInitialization  obj;
  private LazyInitialization()
  {
	System.out.println("Instance Created");
  }
  public static  LazyInitialization  getInstance()
  {
	 if(obj==null)
	 {
		 obj=new LazyInitialization();
	 }
	 return obj;
	 
  }

}
