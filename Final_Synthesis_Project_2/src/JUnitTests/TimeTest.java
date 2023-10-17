package JUnitTests;
import synthesis_project.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import synthesis_project.Time;

public class TimeTest {
		private Time time1;
		private Time time2;

@Before	
public void setUp() throws Exception
{
	time1 = new Time();
	time2 = new Time(3,5,30);
	
}
@After
public void tearDown() throws Exception
{
	time1 = null;
	time2 = null;
}

@Test
public void testMethods() throws Exception
{
	//Testing to see if both time values have actual values
	assertNotNull(time1);
	assertNotNull(time2);
	
	//Testing time1 on setter and getters
	time1.setHour(23);
	assertEquals(23, time1.getHour());
	
	time1.setMinute(9);
	assertEquals(9,time1.getMinute());
	
	time1.setSecond(59);
	assertEquals(59,time1.getSecond());
	
	
	//Testing time2 on setters and getters
	time2.setHour(0);
	assertEquals(0, time2.getHour());
	
	time2.setMinute(0);
	assertEquals(0,time2.getMinute());
	
	time2.setSecond(58);
	assertEquals(58,time2.getSecond());
	
}

@Test //Tests the to String class
public void testToString() throws Exception
{
	String predictedString1 = "0:0:0";
	String predictedString2 = "3:5:30";
	//
	assertEquals(predictedString1,time1.toString());
	assertEquals(predictedString2,time2.toString());
}


//Testing to see if setting the hour lesser than 0 throws an error or not
@Test(expected = InvalidHourException.class) 
public void testGreaterHourException() throws Exception {
	time1.setHour(24);
}
//Testing to see if setting the hour greater than 23 throws an error or not
@Test(expected = InvalidHourException.class) 
public void testLesserHourException() throws Exception {
	time1.setHour(-1);
}



//Testing to see if setting the Minute Greater than 59 throws an error or not
@Test(expected = InvalidMinuteException.class) 
public void testGreaterMinuteException() throws Exception {
	time1.setMinute(60);
}

//Testing to see if setting the Minute lesser than 0 throws an error or not
@Test(expected = InvalidMinuteException.class) 
public void testLesserMinuteException() throws Exception {
	time1.setMinute(-1);
}


//Testing to see if setting the second lesser than 0
//throws an error or not
@Test(expected = InvalidSecondException.class) 
public void testGreaterSecondException() throws Exception {
	time1.setSecond(60);
}

//Testing to see if setting the second greater than 59
//throws an error or not
@Test(expected = InvalidSecondException.class) 
public void testLesserSecondException() throws Exception {
	time1.setSecond(-1);
}

}
