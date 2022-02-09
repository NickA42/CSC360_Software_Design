package EmployeePayroll;

public class ContractorEmployee extends Employee
{

	public ContractorEmployee(String fname, String lname, float hourly_wage, int hours)
	{
		super(fname, lname, hourly_wage, hours);
		payType = new Contractor();
		//arrEmployees[countEmployees-2] = new Employee(fname, lname, hourly_wage, hours);
	}
	
	public void display()
	{
		
	}

}
