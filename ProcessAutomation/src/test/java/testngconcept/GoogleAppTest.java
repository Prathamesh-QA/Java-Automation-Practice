package testngconcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleAppTest extends BaseTest{
	

	@BeforeClass
	public void launchApp() {
		driver.get("https://www.google.co.in/");
	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		String titleExpected = "Google";
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, titleExpected);
	}
	
	@Test(priority=2)
	public void google() {
		Assert.assertTrue(driver.findElement(By.className("lnXdpd")).isDisplayed());
	}

}
