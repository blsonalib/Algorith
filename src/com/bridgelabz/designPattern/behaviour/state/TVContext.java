package com.bridgelabz.designPattern.behaviour.state;

public class TVContext 
{
	private TVRemoteIntf tvState;

	public void setState(TVRemoteIntf state) 
	{
		this.tvState=state;
	}

	public TVRemoteIntf getState()
	{
		return this.tvState;
	}

	public void Action() 
	{
		this.tvState.Action();
	}

}
