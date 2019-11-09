package com.bridgelabz.designPattern.creational.singletone.mains;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable
{
  private List<String>empList =new ArrayList<String>();  
  public Employees()
  {
	
  }
  public Employees(List<String>list)
  {
	  this.empList=list;
  }
  public void LoadData()
  {
	  empList.add("Sona");
	  empList.add("Jaya");
	  empList.add("Riya");
	  empList.add("Neha");
  }
  public List<String> getEmpList() 
  {
		return empList;
	}
@Override
protected Employees clone() throws CloneNotSupportedException
{ 
	List<String>temp=new ArrayList<String>();
	for(String str:this.getEmpList())
	{
	  temp.add(str);	
	}
	return new Employees (temp);
 
	
  }
}
