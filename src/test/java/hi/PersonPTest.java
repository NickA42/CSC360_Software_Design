package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonPTest
{
	PersonP R; 
	PersonP J;
	PersonP M;
	PersonP Y;
	

	@BeforeEach
	void setUp() throws Exception
	{
		R = new PersonP("Romeo", "Mons", 15);
		J = new PersonP("Juliette", "Cam", 13);				
		M = new PersonP("Count", "Dooku", 54);
		Y = new PersonP("Yo", "Da", 973);
	}

	@Test
	void testToString()
	{
		
		assertEquals("Person: Romeo Mons, 15",R.toString());
		//fail("Not yet implemented");
	}

	@Test
	void testPerson()
	{
		
		assertThrows(UnderAgeException.class,
				()->{
					R.makePerson(J);
				});
		assertThrows(UnderAgeException.class,
				()->{
					M.makePerson(J);
				});
		PersonP child;
		try
		{
			child = M.makePerson(Y);
			
			assertEquals(M.getFname(), child.getFname());
			assertEquals(Y.getLname(), child.getLname());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("threw exception");
		}
		
	}
}
