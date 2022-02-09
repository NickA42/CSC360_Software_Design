package EmployeePayroll;

public class HourlyEmployee extends Employee
{
	public HourlyEmployee(String fname, String lname, float hourly_wage, int hours)
	{
		super(fname, lname, hourly_wage, hours);
		payType = new Hourly();
	}
	
	public void display()
	{
		
	}

}
