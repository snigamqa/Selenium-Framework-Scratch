package googlepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	By Search = By.name("q");
	By buttonclick = By.name("btnK");
	
	public NewTest(WebDriver driver)
	{
		this.driver= driver;
	}
  
	public void textboxsearch(String text)
    {
	

	 WebElement webtext = driver.findElement(Search);
	 webtext.sendKeys(text);
  }
  
  public void buttonsearch()
  {
	 WebElement webtext1 = driver.findElement(Search);
	 webtext1.sendKeys(Keys.ENTER);
}
  
  public void beforeMethod() {
	  
	
  }

 
  public void afterClass() {
  }

}
