package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) {
		getproperties();
	}
	
	public static void getproperties()
	{
		try {
 
			Properties prop =new Properties();
			String Path = System.getProperty("user.dir");
			InputStream input = new FileInputStream(Path+ "/src/test/java/Config/Config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String Browser = prop.getProperty("Browser");
			System.out.println(Browser);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
