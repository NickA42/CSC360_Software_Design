package EmployeePayroll;

import java.util.ArrayList;

public class Contractor implements EmployeeType
{
	public static float pay;
	@Override
	public float payEmployee(ArrayList<String> arrPayroll, int hours, float hourly_wage)
	{
		//do math for contractor.. don't even know what math to do ngl.
		pay = hours * hourly_wage;
		
		return (float) pay; 
	}
		
	//input pay into array along with their full name
	public ArrayList<String> insertPay(String fname, String lname, String payStr, ArrayList<String> arrPayroll)
	{
		arrPayroll.add(fname +" "+ lname + ": $" + payStr);
		return arrPayroll;
	}
	
}