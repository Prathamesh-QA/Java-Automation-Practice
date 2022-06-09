package building;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DriverFactory;
import utils.ElementUtil;
import zerocell.ExcelReader;
import zerocell.TestData;

public class ZerocellTest {
	private static WebDriver driver;
	ElementUtil elementUtil;
	

	@Test(dataProvider="getTestData")
	public void googleSearchTest(TestData data) {
		driver = DriverFactory.getDriver(data.getBrowser());
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		elementUtil = new ElementUtil(driver);
		By username = By.xpath("//input[@id='user-name']");
		By password = By.xpath("//input[@id='password']");
		By submit = By.xpath("//input[@id='login-button']");
		By logo = By.className("app_logo");
		
		elementUtil.getElement(username).sendKeys(data.getFirstName());
		elementUtil.getElement(password).sendKeys(data.getPassword());
		elementUtil.getElement(submit).click();

		Assert.assertTrue(elementUtil.waitForElementPresent(logo, 3).isDisplayed());
		driver.quit();
	}
	
	@DataProvider
	public Object[] getTestData() {
		return ExcelReader.getTestData().toArray();
	}

}
