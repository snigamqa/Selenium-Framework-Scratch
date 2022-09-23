package googlepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {

	public static void main(String[] args) {
		String Path = System.getProperty("user.dir");
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Sandeep");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		//driver.findElement(By.name("btnK")).click();

		driver.close();
	
	}

	
}
