package com;

public class ConstructorProgramming {
	int rollno;
	String name,collagename,gender;
	String date;
	
	ConstructorProgramming(int rollno,String name)
	{
		   this.rollno=rollno;
		   this.name=name;
		  
	}
	void display(String collagename,String gender,String date)
	{
		this.collagename=collagename;
		this.gender=gender;
		this.date=date;
		System.out.println("Roll Number    "+rollno+"\nName       "+name);
		
	}
	void dis()
	{
		System.out.println("Collage Name   "+collagename+"Gender         "+gender+"Date Of Birth  " +date);
	}
	
	

}
