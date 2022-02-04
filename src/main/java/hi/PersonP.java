package hi;

public class PersonP
{

	String firstName; 
	String lastName;
	int age;
	/**
	 * @param fname - first name
	 * @param lname - last name 
	 * @param age - age of person in years
	 */
	public PersonP(String fname, String lname, int age)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstName;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstName = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lastName;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lastName = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person: "+ firstName +" "+ lastName +", " + age;
	}
	
	public PersonP makePerson(PersonP that) throws UnderAgeException
	{
		if(age<18 || that.age<18)
		{
			throw new UnderAgeException();
		}
		PersonP child = new PersonP(this.firstName,that.lastName,0);
		return child;
	}
	
	public static void main(String[] args)
	{
		PersonP r = new PersonP("Romeo", "Mons", 22);
		
		System.out.println("R "+ r);
		
	}
	
	
}
