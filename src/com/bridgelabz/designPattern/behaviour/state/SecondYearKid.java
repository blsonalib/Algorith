package com.bridgelabz.designPattern.behaviour.state;

public class SecondYearKid implements KidState
{

	@Override
	public void play()
	{
		System.out.println("Play with toy");
		
	}

	@Override
	public void eat() 
	{
     System.out.println("Eat potatoes and drink milk");		
	}
}
