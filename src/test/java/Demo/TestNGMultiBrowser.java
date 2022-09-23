package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {
	
	WebDriver driver = null;
    
	@Parameters("Browsername")
	@BeforeTest
	public void setup(String Browsername)
	{
		System.out.println("Browser Name==>"+Browsername);
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			String Path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if (Browsername.equalsIgnoreCase("firefox")) {
			String Path = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", Path+"/driver/geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		else if (Browsername.equalsIgnoreCase("ie")) {
			String Path = System.getProperty("user.dir");
			System.setProperty("webdriver.ie.driver", Path+"/driver/chromedriver.exe");
			 driver = new InternetExplorerDriver();
			
		}
	}

	@Test
	public void Test1()
	{
		
		try {
			driver.get("https://google.com");

			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Parameters("Browsername")
	@AfterTest
	public void Teardown()
	{
		driver.quit();
		System.out.println("Test Completed Successfully!!");
	}
}
