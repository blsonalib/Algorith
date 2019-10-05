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
		
			System.out.println(wins+" "+"Game wins"+" "+Trials);
			System.out.println("percent of win"+100.0*wins/Trials);
			System.out.println("Average of bets"+1.0*bets/Trials);
			Utility.Gambler($stake, $goal, Trials, bets, wins);
		}
				
		
	}


