package com.bridgelabz.designPattern.behaviour.state;

public class MainStateDesign {

	public static void main(String[] args) 
	{
		TVContext context = new TVContext();
		TVRemoteIntf  tvStartState = new TvRemoteStartImp();
		TVRemoteIntf  tvStopState = new TVRemoteCloseImp();
		
		context.setState(tvStartState);
		context.Action();
		
		
		context.setState(tvStopState);
		context.Action();
		

	}

}
