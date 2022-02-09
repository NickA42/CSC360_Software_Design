package EmployeePayroll;

import java.util.ArrayList;

public class Employee
{
	// variables
	String fname;
	String lname;
	float hourly_wage;
	int hours;
	EmployeeType payType;
	public static ArrayList<String> arrPayroll = new ArrayList<String>();
	
	public Employee(String fname, String lname, float hourly_wage, int hours)
	{
		this.fname = fname;
		this.lname = lname;
		this.hourly_wage = hourly_wage;
		this.hours = hours;
	}

	// setter for firstname
	public void setFname(String fname)
	{
		this.fname = fname;
	}

	// getter for firstname
	public String getFname()
	{
		return fname;
	}

	// setter for lastame
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	// getter for lastname
	public String getLname()
	{
		return lname;
	}

	// getter for an employees hourly wage
	public void setHourlyWage(float hourly_wage)
	{
		this.hourly_wage = hourly_wage;
	}

	// setter for an employees hourly wage
	public double getHourlyWage()
	{
		return hourly_wage;
	}

	// getter for an employees hours
	public void setHours(int hours)
	{
		this.hours = hours;
	}

	// setter for an employees hours
	public int getHours()
	{
		return hours;
	}
	
}
