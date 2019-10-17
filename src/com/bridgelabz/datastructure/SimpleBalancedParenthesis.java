package com.bridgelabz.datastructure;

import com.bridgelabz.utility.UtilityD;

public class SimpleBalancedParenthesis
{
	public static String parenthesis(String str )
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='['||ch=='('||ch=='{') {
				Stack.push(ch);
			}
			else if((ch==']'||ch=='}'||ch==')')&&(!Stack.isEmpty()))
			{
				if(((char)Stack.peek()=='('&&ch==')')||((char)Stack.peek()=='{'&&ch=='}')||((char)Stack.peek()=='['&&ch==']'))
				{
					Stack.pop(ch);
				}
				else
				{
					return "not balanced";
				}
			     }
			else
			{
				if((ch==']'||ch=='}'||ch==')'))
				{
					return "not balanced";					}
			}
		}
		if (Stack.isEmpty())
			return "balanced";
		else
			return " not balanced";
	}
	public static void main(String[] args) 
	{
		Stack stack=new Stack();
		String str;
		System.out.println("Enter the string:");
		str=UtilityD.getString();
		if(str.isEmpty())
		{
			System.out.println("string is empty");
			return;
		}
    System.out.println(SimpleBalancedParenthesis.parenthesis(str));		
	}

}






