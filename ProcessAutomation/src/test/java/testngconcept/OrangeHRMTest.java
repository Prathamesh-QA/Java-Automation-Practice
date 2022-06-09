package testngconcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OrangeHRMTest extends BaseTest{
	
	@BeforeClass
	public void launchApp() {
		driver.get("https://www.orangehrm.com/");
	}
	
	@Test(priority=1)
	public void orangeHRMTitleTest() {
		String titleExpected = "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS";
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, titleExpected);
	}
	
	@Test(priority=2)
	public void orangeHRMLogoTest() {
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}
	
	@Test(priority=3)
	public void orangeHRMContactButtonTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Contact Sales']")).isDisplayed());
	}

}
