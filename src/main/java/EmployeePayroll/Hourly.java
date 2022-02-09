package EmployeePayroll;

import java.util.ArrayList;

public class Hourly implements EmployeeType
{
	public static float pay;	
	@Override
	public float payEmployee(ArrayList<String> arrPayroll, int hours, float hourly_wage)
	{
		//do math for hourly pay here
		if (hours <= 40)
		{
			pay = hours * hourly_wage;
		}
		else
		{
			hours = hours - 40;
			pay = (float) ((40 * hourly_wage)+(hours * 1.5));
		}
			
		return pay;
	}
	
	//input pay into array along with their full name
	public ArrayList<String> insertPay(String fname, String lname, String payStr, ArrayList<String> arrPayroll)
	{
		arrPayroll.add(fname +" "+ lname + ": $" + payStr);
		return arrPayroll;
	}
	
}
