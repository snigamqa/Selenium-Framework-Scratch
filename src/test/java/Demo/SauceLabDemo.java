package Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabDemo {
	
	public static void main(String[] args) throws MalformedURLException {
		setup();
	}
	
	public static void setup() throws MalformedURLException
	{
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("build", "1.0");
		sauceOptions.put("name", "Google Test");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://oauth-jetlive2021-23cef:d03c9927-0c4b-4b5d-bc0e-30640475fe3c@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		driver.get("https://www.google.com/");
		System.out.println("Title==>>" + driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Sandeep");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.close();
		driver.quit();
	}

}
