package Demo;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://jetsynthesys.spinehrms.in/login.aspx?ReturnUrl=%2f");
    driver.findElement(By.id("txtUser")).clear();
    driver.findElement(By.id("txtUser")).sendKeys("100502");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Sandeep@0211");
    driver.findElement(By.id("txtUser")).click();
    driver.findElement(By.id("txtUser")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=txtUser | ]]
    driver.findElement(By.id("txtUser")).click();
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=txtPassword | ]]
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("btnLogin")).click();
    driver.get("https://jetsynthesys.spinehrms.in/DashboardLight.aspx");
    driver.findElement(By.id("ctl00_BodyContentPlaceHolder_lnkGoToDashBoard")).click();
    driver.get("https://jetsynthesys.spinehrms.in/start_new.aspx");
    driver.findElement(By.id("ctl00_empphoto")).click();
    driver.findElement(By.xpath("//div[@id='divTop']/div/ul[2]/li[2]/ul/li[6]/div/ul/li/div/div[3]/div[4]/a")).click();
    driver.get("https://jetsynthesys.spinehrms.in/LogOff.aspx");
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}


