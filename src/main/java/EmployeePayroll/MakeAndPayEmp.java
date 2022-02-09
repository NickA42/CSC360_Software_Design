package EmployeePayroll;

import java.util.*;

public class MakeAndPayEmp
{	
	//make employee function
	public Object makeEmployee(Employee that)
	{
		Employee newHire = new Employee(that.fname, that.lname, (float) 0.0, (int) 0); 
		return (newHire);
	}
	
	public static void printPayroll(ArrayList<String> arrPayroll)
	{
		for (String i: Employee.arrPayroll) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		//create employee and call methods for each new employee
		Employee h = new HourlyEmployee("John", "Slow", (float) 25.00, 60);
		h.payType.payEmployee(Employee.arrPayroll, 60, (float) 25.00);
		h.payType.insertPay("John", "Slow", Float.toString(Hourly.pay), Employee.arrPayroll);
		Employee s = new SalaryEmployee("Timothy", "Toolip", (float) 20.00, 40);
		s.payType.payEmployee(Employee.arrPayroll, 40, (float) 20.00);
		s.payType.insertPay("Timothy", "Toolip",Float.toString(Salary.pay), Employee.arrPayroll);
		Employee c = new ContractorEmployee("Joey", "Johnson", (float) 30.00, 45);
		c.payType.payEmployee(Employee.arrPayroll, 45, (float) 30.00 );
		c.payType.insertPay("Joey", "Johnson", Float.toString(Contractor.pay), Employee.arrPayroll);
		
		//print out payroll
		printPayroll(Employee.arrPayroll);
	}
	
}
