package testngconcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AmazonTest extends BaseTest{
	

	@BeforeClass
	public void launchApp() {
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=1)
	public void amazonTitleTest() {
		String titleExpected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, titleExpected);
	}
	
	@Test(priority=2)
	public void amazonLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	
	@Test(priority=3)
	public void amazonFooterLinksTest() {
		int count = driver.findElements(By.cssSelector("div.navFooterLinkCol.navAccessibility li")).size();
		Assert.assertEquals(count, 22);
	}

}
