package JUnitTests;
import synthesis_project.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import synthesis_project.*;

public class TaskTest {
	
	private Date date1;
	private Date date2;
	private Task task1;
	private Task task2;
	
@Before
public void create() throws Exception
{
	date1 = new Date();
	date2 = new Date(26,9,2010);
	task1 = new Task();
	task2 = new Task("Clean floors",date1,date2,
			"Use mop with a cup of bleach per gallon of water","Spring Cleaning",false);
}

@After
public void destroy() throws Exception
{
	date1 = null;
	date2 = null;
	task1 = null;
	task2 = null;
}

@Test
public void testMethods() throws Exception
{
	
	assertNotNull(date1);
	assertNotNull(date2);
	assertNotNull(task1);
	assertNotNull(task2);
	
	
	task1.setTitle("Vacuum Floors");
	assertEquals("Vacuum Floors",task1.getTitle());
	
	date1.setDay(25);
	assertEquals(25,date1.getDay());
	
	date1.setMonth(9);
	assertEquals(9,date1.getMonth());
	
	date1.setYear(2010);
	assertEquals(2010,date1.getYear());
	
	task1.setStartDate(date1);
	assertEquals(date1,task1.getStartDate());
	
	task1.setEndDate(date2);
	assertEquals(date2,task1.getEndDate());
	
	task1.setDescription("Vacuum all main level floors.");
	assertEquals("Vacuum all main level floors.", task1.getDescription());
	
	task1.setProjName("Fall Cleaning");
	assertEquals("Fall Cleaning", task1.getProjName());
	
	task1.setStatus(true);
	assertEquals(true, task1.getStatus());

	String predictedString = "Fall Cleaning\n" 
			+ "Done:true\nVacuum Floors\n25/9/2010-26/9/2010\n"
			+ "Vacuum all main level floors.";
	
	assertEquals(predictedString,task1.toString());
	
}

@Test
public void testStringMethods() throws Exception
{
	String predictedString1 = "\nDone:false\n\n0/0/0-0/0/0\n";
	
	assertEquals(predictedString1,task1.toString());
	
	String predictedString2 = "Spring Cleaning\n" + 
			"Done:false\n" + 
			"Clean floors\n" + 
			"0/0/0-26/9/2010\n" + 
			"Use mop with a cup of bleach per gallon of water";
	
			assertEquals(predictedString2,task2.toString());
		
}



}
