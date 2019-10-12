package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.UtilityD;

public class UnorderedLinkedList 
{
 public static void main(String args[]) throws IOException
 {
	UtilityD utility=new UtilityD();
	String line = " ";
	String words[]=new String[10];
	int count = 0;
	LinkedList linkedList=new LinkedList();
	
	FileReader fileReader=new FileReader("/home/userq/BridgelabzSonali/Newjavaproject/src/com/bridgelabz/files/Unorder.txt");
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	
	 //Gets each line till end of file is reached
	while((line=bufferedReader.readLine())!=null)
	{
		//Splits each line into words
		words=line.split(" ");
		 //Counts each word
		count=count+words.length;
	}
	System.out.println(".........Words present in file.........");
	
	
	for(int i=0;i<words.length;i++)
	{
		String str=words[i];
		linkedList.insert(str);
	}
	
	linkedList.show();
	boolean flag=false;
	int size=linkedList.size();
	System.out.println("Size of linked list is : "+size);
	System.out.println("Enter element which you want: ");
	String element=UtilityD.getString();
	
	
	boolean flag1=linkedList.searchNode(element);
	
	
	if(flag1==false)
	{	
		System.out.println("Element not found!");

		linkedList.writeOnFile();
		System.out.println("Successfully written on file!");
		int size1=linkedList.lengthOfLinkedList();
		System.out.println("Size of linked list is : "+size1);
		linkedList.show();			
	}
	else
	{
		linkedList.writeOnFile();
		linkedList.deleteNode(element);
		System.out.println("Successfully deleted element!");
		int size2=linkedList.lengthOfLinkedList();
		System.out.println("Size of linked list is : "+size2); 
		linkedList.show();
	}
	bufferedReader.close();
}

}
