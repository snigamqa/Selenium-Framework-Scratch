package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)
	public void Test1()
	{
	System.out.println("I am inside Test1");	
	}
	@Test(priority = 3)
	public void Test2()
	{
		System.out.println("I am inside Test2");	
	}
	@Test(priority = 2)
	public void Test3()
	{
		System.out.println("I am inside Test3");
	}

}
