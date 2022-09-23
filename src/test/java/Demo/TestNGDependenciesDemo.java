package Demo;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {
	
	@Test(dependsOnGroups = {"Sanity1"})
	public void test1()
	{
		System.out.println("I am inside Test1");
	}

	@Test(groups = "Sanity1")
	public void test2()
	{
		System.out.println("I am inside Test2");
	}
	
	@Test()
	public void test3()
	{
		System.out.println("I am inside Test2");
	}
}
