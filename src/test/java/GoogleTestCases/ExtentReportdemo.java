package GoogleTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportdemo {

	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
    WebDriver driver= null;

	@BeforeTest
	public void setup()
	{
		htmlReporter = new ExtentSparkReporter("extentReports1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		String Path = System.getProperty("user.dir");
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
    public void test2()
    {
		ExtentTest test2 = extent.createTest("Google Search ","Validate google search functionality");
		driver.get("https://google.com");
		test2.pass("Google website opened!!!!");
		driver.findElement(By.name("q")).sendKeys("Sandeep");
		test2.pass("Text serached");
		driver.quit();
		test2.info("Test Completed");
		test2.log(Status.INFO, "This step shows usage of log(status,detail)");
		test2.info("This steps shows the info(detail)");
		test2.fail("detail", MediaEntityBuilder.createScreenCaptureFromPath("1.png").build());
		test2.addScreenCaptureFromPath("1.png");
		

	}
    @AfterTest
    public void teardown()
    {
    	extent.flush();
		
	}

}
