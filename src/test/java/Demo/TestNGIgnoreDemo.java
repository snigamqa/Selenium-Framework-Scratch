package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public abstract class TestNGIgnoreDemo {

	@Test
	@Ignore
	public void Test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Inside Test2");
	}
	
}
