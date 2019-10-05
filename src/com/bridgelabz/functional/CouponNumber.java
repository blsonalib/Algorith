package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CouponNumber 
{

	public static void main(String[] args) 
	{
		char charecter[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int maximum=100000000;
		int random =(int)(Math.random()*maximum);
		
		StringBuffer stringbuffer=new StringBuffer();
		Utility.CouponNumber(maximum, charecter, stringbuffer, random);
	}

}
