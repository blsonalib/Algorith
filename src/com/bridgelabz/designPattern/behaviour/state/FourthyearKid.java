package com.bridgelabz.designPattern.behaviour.state;

public class FourthyearKid implements KidState
{

	@Override
	public void play() 
	{
		System.out.println("Play football");
	}

	@Override
	public void eat() 
	{
		System.out.println("Eat chochlate");
	}
 
}
