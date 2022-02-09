package EmployeePayroll;

import java.util.ArrayList;

public class Salary implements EmployeeType
{
	public static float pay;
	
	@Override
	public float payEmployee(ArrayList<String> arrPayroll, int hours, float hourly_wage)
	{
		//do math for salary 
		pay = 40*hourly_wage;
		return pay;
	}
	
	//input pay into array along with their full name
	public ArrayList<String> insertPay(String fname, String lname, String payStr, ArrayList<String> arrPayroll)
	{
		arrPayroll.add(fname +" "+ lname + ": $" + payStr);
		return arrPayroll;
	}
	
}
