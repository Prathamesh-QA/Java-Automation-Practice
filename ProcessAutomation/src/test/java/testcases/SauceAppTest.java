package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testngconcept.BaseTest;


public class SauceAppTest extends BaseTest{
	

	@Test(priority=1)
	public void amazonTitleTest() {
		extentTest = extent.startTest("amazonTitleTest");
		String titleExpected = "Online Shopping1 site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, titleExpected);
	}
	
	@Test(priority=2,enabled=false)
	public void amazonLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	
	@Test(priority=3,enabled=false)
	public void amazonFooterLinksTest() {
		int count = driver.findElements(By.cssSelector("div.navFooterLinkCol.navAccessibility li")).size();
		Assert.assertEquals(count, 23);
	}

}
