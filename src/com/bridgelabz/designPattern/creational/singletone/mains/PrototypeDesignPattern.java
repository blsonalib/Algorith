package com.bridgelabz.designPattern.creational.singletone.mains;

import java.util.List;

//import java.awt.List;

public class PrototypeDesignPattern
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
	Employees emp=new Employees();
	emp.LoadData();
	Employees empNew= (Employees)emp.clone();
	Employees empNew1=(Employees)emp.clone();
	List<String> list=empNew.getEmpList();
	list.add("Siya");
	Employees empNew2=(Employees)emp.clone();
	List<String> list2=empNew2.getEmpList();
	list2.remove("Sona");
	System.out.println("Emp List:"+emp.getEmpList());
	System.out.println("EmpNew List:"+list);
	System.out.println("EmpNew2 List:"+list2);
	}

}
