package demo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class NewTest {
		
		Logger log = Logger.getLogger(NewTest.class);
	
		@Test(dataProvider="getData")
		public void setData(String name, String rollNo) 
		{ 
			System.out.println("Name: " +name); 
			System.out.println("RollNo: " +rollNo); 
		} 
		@DataProvider(name="getData")
		public Object[][] loginDataProvider()
		{
			return data;
		}
		Object[][] data= 
			{
					{"John","23"},
					{"Sanjana","40"},
					{"Deepa","01"}

			};
	
		@Test	   
		public void testcase1() {
			log.info("Info Message");
	        System.out.println("first test case");
	    }
	    @Test(priority=2)
	    public void testcase2() {
	        System.out.println("second test case");
	            }
	    
	    @Test(priority=1)
	    public void testcase3() {
	        System.out.println("third test case");
	        Assert.assertTrue(false);

	    }
	    @Test(enabled=false) //test case gets ignored
	    public void testcase4() {
	        System.out.println("fourth test case");								
	            }
	    @Test
	    public void testcase5() {
	        System.out.println("fifth test case"); //test case gets skipped
	        throw new SkipException("message");	
	            }
	    
	    @Test(dependsOnMethods= {"testcase2"})
	    public void testcase6() {
	    	System.out.println("Sixth test case");
	    	
	    }
	    @Test(dependsOnMethods= {"testcase3"})
	    public void testcase7() {
	    	System.out.println("Seventh test case");
	    	
	    }
 }

