package JUnitTests;
import synthesis_project.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class EventTest {
private Date startDate;
private Date endDate;
private Time startTime;
private Time endTime;
private Event event1;
private Event event2;
private Address location1;
private Address location2;

@Before
public void create() throws Exception
{
	startDate = new Date();
	endDate = new Date(8,2,2024);
	startTime = new Time();
	endTime = new Time(19,55,29);
	location1 = new Address();
	location2 = new Address("711","Hennepin Ave", "Minneapolis","MN","55403");
	
	event1 = new Event();
	event2 = new Event("Concert",startDate,endDate,"Twenty-One Pilots playing at the Skyway",
			 startTime,endTime,location2);
}

@After
public void destroy() throws Exception
{
	startDate = null;
	endDate = null;
	startTime = null;
	endTime = null;
	location1 = null;
	location2 = null;
	event1 = null;
	event2 = null;
	
}
@Test
public void testMethods() throws Exception
{
	assertNotNull(startDate);
	assertNotNull(endDate);
	assertNotNull(startTime);
	assertNotNull(endTime);
	assertNotNull(location1);
	assertNotNull(location2);
	assertNotNull(event1);
	assertNotNull(event2);
	
	event1.setTitle("Solar Eclipse");
	assertEquals("Solar Eclipse",event1.getTitle());
	
	event1.setStartDate(startDate);
	assertEquals(startDate,event1.getStartDate());
	
	event1.setEndDate(endDate);
	assertEquals(endDate,event1.getEndDate());
	
	event1.setDescription("Once in a lifetime chance.");
	assertEquals("Once in a lifetime chance.",event1.getDescription());
	
	event1.setStartTime(startTime);
	assertEquals(startTime,event1.getStartTime());
	
	event1.setEndTime(endTime);
	assertEquals(endTime,event1.getEndTime());
	
	location2.setNumber("17");
	assertEquals("17",location2.getNumber());
	
	location2.setStreet("Allende");
	assertEquals("Allende",location2.getStreet());
	
	location2.setCity("Nazas");
	assertEquals("Nazas",location2.getCity());
	
	location2.setState("Durango");
	assertEquals("Durango",location2.getState());
	
	location2.setZip("34278");
	assertEquals("34278",location2.getZip());
	
	String predictedString = "17,Allende,Nazas,Durango,34278";
	
	assertEquals(predictedString, location2.toString());
	
	event1.setLocation(location2);
	assertEquals(location2, event1.getLocation());
	
	String predictedString2 = "\nSolar Eclipse\n0/0/0-8/2/2024\nOnce in a lifetime chance.\n"
			+ "0:0:0-19:55:29\n17,Allende,Nazas,Durango,34278";
	

	assertEquals(predictedString2, event1.toString());
	

}

@Test
public void testStringMethods() throws Exception
{
	String predictedString1 = "\n\n0/0/0-0/0/0\n\n" + 
			"0:0:0-0:0:0\n,,null,,";
	assertEquals(predictedString1,event1.toString());
	String predictedString2 = "\nConcert\n0/0/0-8/2/2024\n" +
			"Twenty-One Pilots playing at the Skyway\n" + 
			"0:0:0-19:55:29\n711,Hennepin Ave,Minneapolis,MN,55403";
	assertEquals(predictedString2, event2.toString());
}


}
