package com.bridgelabz.designPattern.behaviour.state;

public class ThirdYearKid implements KidState
{

	@Override
	public void play() 
	{
    System.out.println("Play with ball");		
	}

	@Override
	public void eat() 
	{
	System.out.println("Eat food");
		
	}
 
}
