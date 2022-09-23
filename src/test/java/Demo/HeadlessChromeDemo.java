package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		Test();
	}
	
	public static void Test()
	{
		String Path = System.getProperty("user.dir");
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Sandeep");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("test completed");
		driver.close();
		driver.quit();
		
	}

}
