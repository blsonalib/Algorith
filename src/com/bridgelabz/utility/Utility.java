package com.bridgelabz.utility;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Utility {
	public static Scanner scanner=new Scanner(System.in);
	
		public static int getInteger()
		{
			return  scanner.nextInt();
	}
	/**
	 * @param number
	 */
	/*program for prime number*/
	
public static void primeFactor(int number)
{
		for(int i=2;i<=number;i++)
	    {
	    	while(number%i==0)// number is 0 or not 
	    	{
	    		number=number/i;
	    		System.out.println(+i);
	    	}
	    	if(number<1)
	    	System.out.println(+number);
	    }
	}
	
	
/*program for power of number*/
	
public static void PowerOf(int number,int i) 
{
		
	while(i<=number)
	{
		System.out.println("the power of 2^"+i+"="+Math.pow(2, i));//math.pow()method used for power of the number and return double value
		i++;
	}

}
	

/*program to print harmonic series*/

public static void HarmonicNumber(float value,int number)
{
	while(number>0)
	{
		value=value+(float)1/number; //Add the value eg.(1+1/2)
	//System.out.println(value+" ");
		number--;
	}
	System.out.println("Harmonic number="+value);
}

/* program the year is leap year or not*/

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


/*program for Euclidean distance from point (x,y)*/
public static void EuclideanDistance(int x,int y,double sum1,double sum2,double distance)
{
	sum1=Math.pow(x, 2); //power of x
	sum2=Math.pow(y, 2); //power of y
	distance=sum1+sum2; 
	System.out.println("Euclidean distance from("+x+","+y+")to(0,0)="+Math.sqrt(distance));
}

/* program for quadratic eduation find the value of x*/
public static void QuadraticEquation(int a,int b,int c,double Root1,double Root2,double delta)
{
	delta=Math.sqrt(b*b-4*a*c);
	Root1=(-b+delta/(2*a));
	Root2=(-b-delta/(2*a));
	System.out.println("The roots of x is:  a*x*x+b*x+c:" +Root1+"and"+Root2);
}

/*program for windchill*/
public static void WindChill(double temperature,double speed,double windchill)
{
	speed=Math.pow(speed, 0.16); //find power of the speed value (v^0.16 let,v=speed) 
    windchill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*speed;
    System.out.println("The effective temperature of the windchill is:"+windchill);
}
/*program for Escaped time in stopwatch*/
public static void StopWatch(int n,long start,long stop) throws InterruptedException 
{
	start=System.currentTimeMillis();
	for(int i=0;i<=n;i++)
	{
		TimeUnit.SECONDS.sleep(1); //duration between start to stop watch
	}
	stop=System.currentTimeMillis();
    long elapsedTime=stop-start;
}


/* program for Gambler*/
public static void ArrayOutputStream(int array[][],int row,int column,int i,int j)
{
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.print("Enter the value:");
			array[i][j]=Utility.getInteger();
			
		}
	}
	System.out.println("Matrics:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.print(" "+array[i][j]);
		}
		System.out.println();
	}
}

/*program for Gambler*/
public static void Gambler(int $stake,int $goal,int Trials,int bets,int wins)
{
	for(int number=0;number<Trials;number++)
	{
		int cash=$stake;
		while(cash>0&&cash<$goal)
		{
			bets++;
			{
				if(Math.random()<0.5)
		     	{
		    	 cash++; //won $1
		     	}
				else
		 		{
		    	 cash--;//lose $1
		 		}
			}
		 }
		 if(cash==0)
			 wins++;
		}
}


/*program for flip coins*/
public static void Flipcoin(int flips,double i)
{
	double heads=0,tails=0;
	while(i<=flips)
	{
		System.out.println(i+" "+Math.random());//random number between 0 and 1
		if(Math.random()<0.5)
		{
			
			System.out.println("heads");
			heads++;
			//System.out.println("percent of head:"+heads/flips*100);
		}
		else
		{
			
			System.out.println("tails");
			tails++;
			//System.out.println("percent of tails:"+(tails/flips*100));
		}
		i++;
	}
		System.out.print("\n");
		double headpercent=heads*100/flips;
		System.out.println("percent of heads:"+ headpercent);
		double tailspercent=100-(headpercent);
		System.out.println("percent of tails:"+tailspercent);


}
/*program for sum of three integer add to zero*/
public static void SumOfThreeInteger(int array[]) 
{
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			for(int k=j+1;j<array.length;k++)
			{
				if(array[i]+array[j]+array[k]==0)
				{
					System.out.println("Number is found"+array[i]+","+array[j]+"and"+array[j]);
				}
			}
		}
	}

}

/* program for generate distinct coupon*/
public static void CouponNumber(int maximum,char[] charecter,StringBuffer stringbuffer,int random)
{
	
	while(random>0)
	{
		stringbuffer.append(charecter[random%charecter.length]);//append method append charecter of stringbuffer class
		random/=charecter.length;//length of the charecter value
		String couponcode=stringbuffer.toString();
		System.out.println("coupon code:"+couponcode);
	}
	
	
}

/*program for sum of three integer is zero*/

public static void TripletsIsZero(int array[],boolean found,int n)
{
for(int i=0;i<n-2;i++)
{
 for(int j=i+1;j<n-1;j++)
 {
	 for(int k=j+1;k<n;k++)
	 {
		 	if(array[i]+array[j]+array[k]==0)
			{
		 		System.out.print(array[i]+" ");
		 		System.out.print(" ");
		 		System.out.print(array[j]+" ");
		 		System.out.print(" ");
		 		System.out.print(array[k]+" ");
		 		System.out.println();
		 		found =true;
		 	}
	 	}
 	}
}
if(found==false)// the sum of all number the 0 is not found
	System.out.println("Number not found");

}
}

