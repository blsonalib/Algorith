package com.bridgelabz.designPattern.creational.singletone.mains;

import com.bridgelabz.designPattern.singleTone.BillPughSingleTone;

public class BillPughSingleTonMain 
{

	public static void main(String[] args) 
	{
        BillPughSingleTone obj=BillPughSingleTone.getInstance();
        obj.newShow();
	}

}
