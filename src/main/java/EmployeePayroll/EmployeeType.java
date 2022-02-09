package EmployeePayroll;

import java.util.ArrayList;

public interface EmployeeType
{
	public float payEmployee(ArrayList<String> arrPayroll, int hours, float hourly_wage);

	public ArrayList<String> insertPay(String fname, String lname, String payStr, ArrayList<String> arrPayroll);
	
}