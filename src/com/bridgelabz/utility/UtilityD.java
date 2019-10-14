package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

//import com.bridgelabz.datastructure.LinkedList.Node;

public class UtilityD 
{
	public static Scanner scanner=new Scanner(System.in);
	
	public static String getString()
		{
		 String string=scanner.nextLine();
		 return string;
	 }
	public static int getInteger() 
	{
		int integer=scanner.nextInt();
		return integer;
	}
	public static double getDouble()
	{
		double Double=scanner.nextDouble();
		return Double;
	}
	/*for prime number 0-1000*/
	public static boolean primeNumber(int number)
	{
		if (number == 0 || number == 1) 
		{
			return false;
		}
		for (int i = 2; i < number; i++) 
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	/*check for prime*/
	public static boolean isPrime(int n)
	{
		
		for(int j=2;j<=n/2;j++) {
			int rem = n % j;
			
			if(rem == 0) {
				return false;
			}
			
		}
		return true;

	}
	
	
	/*prime number for 2D aray*/
	public static int[][] PrimeNumberArray(int n) 
	{
		int [][]prime = new int [10][25];
		int first=0,second=0,third=0,fourth=0;
		int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
	
		for(int i=2;i<n;i++) 
		{
			
			if(isPrime(i))  //check foo prime
			{
			
			if((i > 0) && (i<= 100))
			prime[0][first++] = i;
	
			else if((i > 100) && (i <= 200))
				prime[1][second++]=i;
			
			else if((i > 200) && (i<= 300)) 
				prime[2][third++] = i;
			
			else if((i> 300) && (i <= 400)) 
				prime[3][fourth++] =i;
			
			else if((i > 400) && (i <= 500)) 
				prime[4][fifth++] = i;
			
			else if((i> 500) && (i <= 600)) 
				prime[5][sixth++] = i;
			
			else if((i>600)&&(i<=700)) 
				prime[6][seventh++]=i;
			
			else if((i> 700) && (i <= 800)) 
				prime[7][eight++] = i;
			
			else if((i> 800) && (i <= 900)) 
				prime[8][nineth++] = i;
			
			else if((i> 900) && (i <= 1000)){	
				prime[9][ten++] = i;
			}
		}
		}
		
		
		return prime;
				
	}
	
	
	
	public static int[] primeAnagram(int range) {
		int index = 0;
		String[] array1 = new String[168];
		int[] anagram = new int[158];  //to store anagrams
		int count = 0;
		
		for(int i=2;i<range;i++)
		{
			if(isPrime(i)) //check for prime
			{
				array1[index] = String.valueOf(i); // integer to string conversion
				index++;
			}
		}
		
		

		for(int i=0;i<index;i++)  //to traverse array
		{
			for(int j=i+1;j<index;j++)
			{
				if(isAnagram(array1[j], array1[i])) //to compare ith element with jth element
				{ 
					//store ith as well as jth positions numbers
					anagram[count] = Integer.parseInt(array1[i]);  //String to integer
					count++;
					anagram[count] = Integer.parseInt(array1[j]);
					count++;
				}
			}
		}
		
		return anagram;
	}
		

	//anagram check
		public static boolean isAnagram(String str1, String str2)
		{
				boolean status=true;
				
				if(str1.length() != str2.length())  //check length of two strings are equal or not
					status = false;
				else 
				{ 
					//convert strings to character array to compare their characters
					char[] str1Array = str1.toCharArray();
					char[] str2Array = str2.toCharArray();
					
					//sort both char arrays
					Arrays.sort(str1Array);
					Arrays.sort(str2Array);
					
					status = Arrays.equals(str1Array, str2Array); //compare two arrays
		 		}
				if(status)
					return true;
				else 
					return false;
			}
		

/*program for calender*/
		public static void dayOfWeek(int m, int y)
		{
			int d = 1;
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			
		}

		public static void LeapYear(int year,boolean flag)
		{
		if(year%4==0)  // for check it is leap year or not
		{
			if(year%100==0)  //for check it is ordinary year 
			{
				if(year%400==0)
				{
					flag=true; // if it is leap year
					
				}
				else
					flag=false;//not leap year
			}
			else
				flag=true;
		}
		else
			flag=false;
		if(flag)
			System.out.println(year+" "+"is a leap year");
		else
			System.out.println(year+" "+"is not a leap year");
		}
		 
		
		static boolean checkYear(int year) 
		    { 
		    // Return true if year is a multiple 
		    // of 4 and not multiple of 100. 
		    // OR year is multiple of 400. 
		    return (((year % 4 == 0) && (year % 100 != 0)) || 
		            (year % 400 == 0)); 
		    } 

  /*program for binary search tree */
		public static double binarySearchTree(double total) 
		{
			double numerator=factor(2*total);
			double denominator=factor(total+1)*factor(total);
			double diffrence=numerator/denominator;
			return diffrence;
			
		}
		private static double factor(double d) 
		{
			double a=1;
			while(d>0)
			{
				a=a*d;
				d--;
			}
			return a;
		}

		public static void cashCounter(int people) 
		{
			int balance=1000;
			for(int i=0;i<people;i++)
			{
				
				System.out.println("What do you want to do ");
				System.out.println("1. Deposite ");
				System.out.println("2. Withdraw ");	
				System.out.println("enter your choice ");
				int choice=Utility.getInteger();
				
				switch (choice) 
				{
				case 1:
							System.out.println("How much money you want to deposite : ");
							int money1=Utility.getInteger();
							Queue.enQueue(money1);
							balance=balance+money1;
							System.out.println("Your Balance is : "+balance);
							int size=Queue.size();
							System.out.println("size of queue:"+size);
							//q.deQueue();
							
							break;
							
						case 2:
							System.out.println("How much money you want to withdraw : ");
							
							int withdraw=Utility.IntegerValue();
							
							Queue.enQueue(withdraw);
							if(balance>withdraw)
							{
								balance=balance-withdraw;
								System.out.println("Your remaining balance is: "+balance);
							}
							else
							{
								System.out.println("insufficient balance");
							}
							
							Queue.deQueue();
						
							break;
							
		
						default:
							System.out.println("enter valid choice");
							break;
						}
			}
			
		}
}



	

	