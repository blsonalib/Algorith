package com.bridgelabz.functional;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.bridgelabz.utility.Utility;

public class StringName
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String st=new String("Hello <<UserName>>,How are you?");
	    System.out.println("Enter the name:");
		String name=scan.next();
		 
         Pattern pattern=Pattern.compile("[A-Z][a-z]+{3,20}");
         Matcher matcher=pattern.matcher(name);
         if(matcher.matches())
         {
        	 st=st.replaceAll("<<UserName>>", name);
        	 System.out.println(st);
         }
         else
         {
        	 System.out.println("User should get more than 3 charecter");
         }
       }
	}
         