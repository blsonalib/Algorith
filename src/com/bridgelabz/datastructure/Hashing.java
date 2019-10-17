package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import java.io.File;
//import java.io.FileNotFoundException;


public class Hashing 
{  
	public static void main (String args[]) throws FileNotFoundException
	{
		HashingFunction hash=new HashingFunction();

    File file=new File("/home/admin1/eclipse-workspace/Fellowship_java/src/com/bridgelabz/files/hashing.txt");    
    Scanner fileinput = new Scanner(file).useDelimiter(",");
    int line;
   while(fileinput.hasNextInt())
   {
   line = fileinput.nextInt();
        hash.insert(line);
    }
   
    hash.printHashTable();
  

//hash.printHashTable();

}

}
