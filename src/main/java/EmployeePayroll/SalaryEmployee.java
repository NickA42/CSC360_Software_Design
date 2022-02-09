package EmployeePayroll;

public class SalaryEmployee extends Employee
{

	public SalaryEmployee(String fname, String lname, float hourly_wage, int hours)
	{
		super(fname, lname, hourly_wage, hours);
		payType = new Salary(); 
		//arrEmployees[countEmployees-2] = new Employee(fname, lname, hourly_wage, hours);
		
	}
	
	public void display()
	{
		
	}

}