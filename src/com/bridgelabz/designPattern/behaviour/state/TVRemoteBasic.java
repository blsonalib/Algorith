package com.bridgelabz.designPattern.behaviour.state;

public class TVRemoteBasic 
{
   private String state="";

   public void setState(String state) 
   {
	 this.state = state;
    }
    public void Action()
    {
		if(state.equalsIgnoreCase("ON"))
		{
			System.out.println("TV is turned ON");
		}
		else if(state.equalsIgnoreCase("OFF"))
		{
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String args[])
	{
		TVRemoteBasic remote = new TVRemoteBasic();
		
		remote.setState("ON");
		remote.Action();
		
		remote.setState("OFF");
		remote.Action();
	}
 
}
