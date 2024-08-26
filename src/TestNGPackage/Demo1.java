package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	void test1()
	{
		Reporter.log("test1 method excuted");
	}

	@Test
	void test2()
	{
		Reporter.log("test2 method excuted");
	}
	
}
