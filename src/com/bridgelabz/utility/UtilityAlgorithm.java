package com.bridgelabz.utility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UtilityAlgorithm 
{
		public static Scanner scanner=new Scanner(System.in);
		public static String getString()
		{
			return  scanner.next();
		}
		public static int getInteger()
		{
			return scanner.nextInt();
		}
		public static float getFloat()
		{
			return scanner.nextFloat();
		}
		public static double getDouble()
		{
		
			return scanner.nextDouble();
		}
	/*program for Anagram string or not */
		public static void AnagramDetection(String string1,String string2,int length1,int length2,int length,int i,int j,int found,int notfound)
		{
		if(length1==length2)
		{
			length=length1;
			for(i=0;i<length;i++)
			{
				found=0;
				for(j=0;j<length;j++)
				{
					if(string1.equalsIgnoreCase(string2))
					{
						found=1;
						break;
						
					}
				}
				if(found==0)
				{
					notfound=1;
					break;
				}
			}
			if(notfound==1)
			{
				System.out.println("String are not Anagram");
			}
			else
			{
				System.out.println("String are Anagram");
			}

		}
		
		else
		{
			System.out.println("string1 and string2 have number of characters this are angram strings ");
		}
}
		
		
/*program for range of the prime number 0 to 1000*/
   public static void PrimeRange(int i,int j)
   {
	 for(i=1;i<1000;i++)//for 1 to 1000 number
	 { 
		 boolean flag=true;
		 for(j=2;j<=i-1;j++)//for check prime number
		 {
			 if(i/j==0)
			 {
				 flag=false;
				 break;
			 }
		 }
		 if(flag==true)
		 {
			 System.out.println(+i);
		 }
		
	 }
	}
   
   
   /*program for temperature conversion*/
   public static void TemperatureConvert(double fahreheit,double celsius,int choice)
   {
	  
   switch(choice) 
	{
		case 1:
				System.out.println("Enter the temperature in celsius:");
				double c=UtilityAlgorithm.getDouble();//get the inpute for the user in double
				fahreheit=(c*9/5)+32;
				System.out.println(+fahreheit);
				break;
		case 2:
				System.out.println("Enter teh temperature i farenheit:");
				double f=UtilityAlgorithm.getDouble();
				celsius=(f-32)*5/9;
				System.out.println(+celsius);
				break;
		default:
				System.out.println("Invalid temperature:");
				break;
	}
   }
  
   //program for temperature by using static fuction*/
   
   public static double Conversion(double fahrenheit)
	{
		return ((fahrenheit-32)*5/9);
		
	}
   
/*program for monthly payment*/
   public static void MonthlyPayment(int principle,int year,int rateOfInterest,float payment,int timePeriod,int rate,int numberOfYears)
   {
	   numberOfYears=12*year;
		rate=rateOfInterest/(12*100);
	    timePeriod=(int)Math.pow((1+rate), (-numberOfYears));
		payment=principle/1-timePeriod;
		System.out.println("Payment is:"+payment);	
   }
   
 /* program for binary search in wordlist*/
public static void BinaryWord(String stringList[],String stringFind,int lowest,int highest)
{
	System.out.println(lowest+":"+highest+":"+stringList+":"+stringFind);
	int middle=0;
   while(lowest<=highest)
	{
		middle=(lowest+highest)/2;
		
		if(stringFind.compareTo(stringList[middle])>0)
		{
			lowest=middle+1;
		}
		else if(stringFind.compareTo(stringList[middle])<0)
		{
			highest=middle-1;
		}
		else
		{
			break;
		}
	}
	
		if(lowest>highest)
		{
			System.out.println("String not found");
		}
		else
		{
			System.out.println("String found at"+middle);
		}
  }

public static boolean LeapYear(int year)
{
	if(((year%4==0)&&(year%100!=0))||(year%400==0))
	{
		return true;
	}
	return false;
}

/* program for sorted array in string */
	public static boolean validateDate(int month,int day, int year)
	{
		 int	y0 = year - (14 - month) / 12;
		    int	x = y0 + (y0/ 4) - (y0 /100) + (y0/400);
		    int	m0 = month + 12* ((14 - month) / 12) - 2;
		    int	d0 = (day + x + 31* m0/12)%7;
		    switch(d0)
		    {
		    case 1 : System.out.println("its monday");
		    		  break;
		    case 2 : System.out.println("its tuesday");
		    		  break;
		    case 3 : System.out.println("its wednesday");
			    	  break;
		    case 4 : System.out.println("its thursday");
			  		  break;
		    case 5 : System.out.println("its friday");
			  		  break;
		    case 6 : System.out.println("its saturday");
			  		  break;
		    case 0 : System.out.println("its sunday");
			          break;
		}
		   
				if (year<1582)
					return false;
				if(month<1 || month>12)
					return false ;
				if(day<1 || day>31)
					return false;
				boolean leapyear=LeapYear(year);
				if(month==2) 
					if(leapyear) {
						if(day<1 || day > 29)
							return false;
				}
				else 
				{
					if(day<1 || day >28)
							return false;
				}
				if(month==4 || month ==6 || month ==9 || month ==11)
					if(day<1 || day>30)
						return false; 
				return true;
			}
		
		
	

	

/*program for bubble sort*/
public static void BubbleSort(int array[])
{
	
	
	int temporary=0;
	System.out.println("Before sorting element:");
	for(int i=0;i<array.length;i++)
	{
		for(int j=1;j<(array.length)-1;j++)
		{
			if(array[j-1]>array[j])
			{
				temporary=array[j-1];//swap elements
				array[j-1]=array[j];
				array[j]=temporary;
			}
		}
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]+" ");
		
	}
	
	
	
	System.out.println("After sorting element:");
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]+" ");
	}
	    
}
/*program for sorting string by using insertion sort*/
public static void InsertionSort(String array[],String key)
{    
	for(int j=1;j<array.length;j++)
	{
		key=array[j];
		int i=j-1;
		while(i>=0)
		{
			if(key.compareTo(array[i])>0)
			{
				break;
			
		}
		array[i+1]=array[i];
		i--;
	}
	array[i+1]=key;
	System.out.println(Arrays.toString(array));
}
	
}

//}
/*program for newton method*/
public static void NewtonMethod(double c,double epsilon,double t)
{
	while(Math.abs(t-c/t)>epsilon*t)
	{
		t=(c/t+t)/2.0;
	}
}

/*program for converting decimal to binary*/
public static void DecimalToBinary(int binary[],int number,int i)
{ 
	int temp=number;
	while(temp!=0)
	{
	   binary[i++]=temp%2;//remender is 0 or 1
	   temp=temp/2; 
	   
	}
	System.out.println("Binary value is:");
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(""+binary[j]);//for reverse value
	}
	System.out.println();
}


/*program for vending machin*/


public static  int calculate(int money,int[]notes )
	{
	 int i=0;
	
    int rem;
	if(money==0)
	{
		return -1 ;
	}
	else
	{ 
		if(money>=notes[i])
		{
			
			int calNotes =money/notes[i];
			rem = money%notes[i];
			money =rem;
			int total = calNotes;
			System.out.println(notes[i]+   " Notes ---> " +calNotes );
		}
		i++;
		return calculate(money, notes);
		
	}
	
}//end of method

/*program for swapping nibbles*/
	
	
public static int SwapNibbles(int x)
{
	
	return (x&0x0F<<4|x&0xF0>>4);
}

/*Program for merge sort*/

public static void mergeSort(String[] names) 
{
	
    if (names.length > 2) 
    {
        String[] left = new String[names.length / 2];
        String[] right = new String[names.length - names.length / 2];

        for (int i = 0; i < left.length; i++) 
        {
            left[i] = names[i];
        }

        for (int i = 0; i < right.length; i++) 
        {
            right[i] = names[i + names.length / 2];
        }

        mergeSort(left);
        mergeSort(right);
        mergesort(names, left, right);
    }
}

public static void mergesort(String[] names, String[] left, String[] right) {
    int a = 0;
    int b = 0;
    for (int i = 0; i < names.length; i++) 
    {
        if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
            names[i] = left[a];
            a++;
        } else 
        {
            names[i] = right[b];
            b++;
        }
    }
}


/*program for prime palindrom number*/
public static void PrimePalindromNumber(boolean flag,int num,int temp,int rem,int reversed)
{
for (int number = 1; number <= num; number++) 
{
	 flag = true;
	 	if (number >= 2) {
	 		for(int i = 2; i <= (number/2) ; i++)
	 		{
	 			if((number % i) == 0)
	 				flag= false;
	 		}
	 		if (flag) 
	 		{
	 			temp = number;
	 			reversed = 0;
	 			while (temp != 0) 
	 			{
	 				rem = temp % 10;
	 				reversed = (reversed * 10) + rem;
	 				temp /= 10;
	 			}
	 			if (reversed == number) 
	 			{
	 				System.out.print(number + " ");
	 			}
	 			
	 		}
	 	}
 }
System.out.println();
}

/*program binary search for integer*/

public static int binarySearch(int arr[], int first, int last, int key){  
    if (last>=first){  
        int mid = first + (last - first)/2;  
        if (arr[mid] == key){  
        return mid;  
        }  
        if (arr[mid] > key){  
        return binarySearch(arr, first, mid-1, key);//search in left subarray  
        }else{  
        return binarySearch(arr, mid+1, last, key);//search in right subarray  
        }  
    }  
    return -1;  
}  
}


