package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeMethod
	public void setup() {
		System.out.println("setup call.");
	}
	
	@Test(priority=1)
	public void validLogin() {
		System.out.println("Valid LoginTest.");
	}
	
	@AfterMethod()
	public void tearDown() {
		System.out.println("close Browser.");
	}

}
