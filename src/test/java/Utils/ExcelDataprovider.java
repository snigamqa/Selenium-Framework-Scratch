package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider {
	
	public  WebDriver driver ;

@BeforeTest
public void setup()
{

	  String Path = System.getProperty("user.dir");
			System.out.println(Path);
			System.setProperty("webdriver.chrome.driver", Path+"/driver/chromedriver.exe");
		
		   driver = new ChromeDriver();
			driver.manage().window().maximize();

	
}

	
	
	@DataProvider(name = "Test1Data")
		public static Object[][] getdata()
	{
		String path= System.getProperty("user.dir");

		String excelPath = path+"/excel/data.xlsx";
		Object data[][]= testData(excelPath, "Sheet1");
		return data;
	}
	

	@Test(dataProvider="Test1Data")
	public void test1(String Username, String Password) throws Exception
	{
		driver.get("http://114.143.181.228:10014/login");
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(Password);
		
		
		System.out.println(Username+" | "+Password );
		
		driver.quit();
		

	}
	
	public static Object[][] testData(String excelPath, String SheetName)
	{
		XcelUtils excel = new XcelUtils(excelPath, SheetName);
		int rowcount= excel.Getrowcount();
		int colcount= excel.Getcolcount();
		
		Object data[][] = new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				try {
					String celldata= excel.Getrowdata(i, j);
					System.out.print(celldata);
					data[i-1][j]= celldata;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		return data;
		
	}

}
