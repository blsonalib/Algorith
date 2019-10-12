package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Gambler 
{

	public static void main(String[] args) 
	{
		int $stake=Integer.parseInt(args[0]);
		int $goal=Integer.parseInt(args[1]);
		int Trials=Integer.parseInt(args[2]);
		int bets=0;
		int wins=0;
		Utility.Gambler($stake, $goal, Trials, bets, wins);
		}
				
		
	}


