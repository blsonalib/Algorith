package com.bridgelabz.designPattern.behaviour.state;

public class Kid 
{
 private int age;
 private KidState kidstate;
 public Kid(int age)
  {
	 this.age=age;
  }
  public void play()
 {
	 kidstate.play();
	
 }
 public void eat()
  {
    	kidstate.eat(); 
  }
 public void setAge(int age)
 {
	 this.age=age;
	 if (age==1)
	 {
		 kidstate= new FirstYearKid();
	 }
	 else if(age==2)
	 {
		 kidstate= new SecondYearKid();
	 }
	 else if(age==3)
	 {
		 kidstate= new ThirdYearKid();
	 }
	 else if(age==4)
	 {
		 kidstate= new FourthyearKid();
	 }
	 else
	 {
		 kidstate= new FirstYearKid();
	 }
 }
 
}
