package testPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2 {
	
	WebDriver driver;
			
		@DataProvider(name="getData")
	    public Object[][] loginDataProvider()
	    {
	        return data;
	    }
	    Object[][] data= 
	    {
	        {"pankaj.rachha111@gmail.com","Pankaj@1#"}
	    };
	    
		@Test(priority=1, dataProvider="getData", dependsOnMethods = {"OpenBrowser"})
		public void SignIn(String uname, String password)
		{
			driver.findElement(By.id("userEmail")).sendKeys(uname);
			driver.findElement(By.id("userPassword")).sendKeys(password);
			driver.findElement(By.id("login")).click();
			System.out.println("Sign In executed");
		}
		
		@Test(priority=2)
		public void OpenBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Pankaj\\Chrome Driver Downloads\\chromedriver-win64\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("https://rahulshettyacademy.com/client");
			driver.manage().window().maximize();
			System.out.println("OpenBrowser executed");
		}
		
		@Test(priority=3,dependsOnMethods = {"SignIn"})
		public void LandingPage()
		{
			System.out.println("Page Title="+driver.getTitle());
			System.out.println("Landing Page executed");
		}
		
		@Test(priority=4)
		public void LogOut()
		{
			driver.quit();
			System.out.println("Tear Down");			
		}
		


}
