package automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class s1 {
	@BeforeSuite //run before all tests in this suite
	public void openchrome11() {
		System.out.println("before Suite");
	}
	@BeforeTest //run before any test method belong to the class
	public void openchrome22() {
		System.out.println("before Test");
	}
	
	@BeforeClass //run before the first test method in the current class 
	public void openchrome() {
		System.out.println("before class");
	}
	@BeforeMethod //run before each test method 
	public void openBrowser() {
		System.out.println("before method");
	}
	
	@Test(priority=1,groups = { "regression" })
	public void Login() {
		System.out.println("test method");
	}

	@Test(priority=0,groups = { "smoke" })
	@Parameters ({"Chrome", "val2"})
	public void LoginBrowser(String v1, String  v2) {
		
		System.out.println("test method Enter" + v1 + v2);
	}
	@AfterMethod //run after each test method
	public void closeBrowser1() {
	
	    System.out.println("after method");
	}
	@AfterClass //run after all the test method in current class
	public void closechrome() {
		System.out.println("after class");
	}
	@AfterTest
	public void openchrome33() {
		System.out.println("after Test");
	}
	@AfterSuite
	public void closechrome44() {
		System.out.println("after Suite");
	}
}




