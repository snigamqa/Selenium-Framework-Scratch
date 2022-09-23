package GoogleTestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import googlepage.NewTest;

public class NewTestcasesTest {
	
	public  WebDriver driver ;

@BeforeTest
public void setup()
{

	  String Path = System.getProperty("user.dir");
			System.out.println(Path);
			System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
		
		   driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");

	
}
  @Test
  public  void SearchText() throws Exception {
	  NewTest objPP = new NewTest(driver);

		objPP.textboxsearch("Sandeep");
		objPP.buttonsearch();
		

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();		}
	}
  
  @AfterTest
  public void teardown()
  {
	  driver.quit();
  }
}
