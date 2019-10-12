package com.bridgelabz.datastructure;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] elements = isPrime();
		for(int i = 0; i < elements.length; i++)
		{
			for(int j = 0; j < elements[i].length; j++)
			{
				if(elements[i][j] != 0)
				System.out.print("\t " +elements[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][] isPrime()
	{
		int num = 1;			
		int[][] elements = new int[10][100];
		int j = 1;
		int k = 0;		
		while(num < 1000)
		{
			boolean st = true;
			if(num == 1 || num == 2)
			{	
				
				num ++;
				continue;
			}
			for(int i = 2; i < num  ; i++)
			{
				if(num % i == 0)
				{   
					st = false;
					break;	
				}	
			}	
			if(st) 
			{
				k = num / 100;
				j = num % 100;
				elements[k][j] = num;
			}
			num ++;
		}
		return elements;
	}

}
