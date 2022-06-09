package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingletonPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void titleTest() {
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
