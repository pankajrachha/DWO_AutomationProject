package testPackage;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases2 {
	
	@Parameters({"URL"})
	@Test
	public void testCase(String urlVal)
	{
		System.out.println("***************************************");
		System.out.println("Newly created Testcases2 executed");
		System.out.println(urlVal);
		System.out.println("***************************************");
	}
	
	@Test
	public void testCase10()
	{
		System.out.println("Testcase 10 executed");
	}

}
