package com.bridgelabz.designPattern.singleTone;

public class BillPughSingleTone 
{
  private BillPughSingleTone()
  {
	  
  }
  private static class SingleToneHelper
  {
	  private static final BillPughSingleTone obj=new BillPughSingleTone();
  }
  public static BillPughSingleTone getInstance()
  {
	  return SingleToneHelper.obj;
  }
  public void newShow()
  {
	  System.out.println("Bill pugh singletone");
  }
}
