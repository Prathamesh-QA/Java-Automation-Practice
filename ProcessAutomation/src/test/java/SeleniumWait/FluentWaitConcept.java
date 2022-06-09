package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.ElementUtil;

public class FluentWaitConcept {
	
	/**
	 * Fluent Wait is implementing Wait Interface and is a Parent Class of the WebDriver Wait Class
	 * Fluent Wait is same as WebDriver wait as it is dynamic only difference is that we can define the
	 * polling mechanism in Fluent Wait
	 * We can ignore if any exception occurs while polling 
	 * 
	 * Difference between WebDriverWait and Fluent Wait
	 * 1. Only if some exceptions during polling should be ignored that time we can use FluentWait
	 *    FluentWait can be used over the WebDriverWait in framework
	 */
	static WebDriver driver;
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		By username = By.xpath("//input[@name='email']");
		By password = By.xpath("//input[@name='password']");
		By login = By.xpath("//input[@value='Login']");
		
		ElementUtil util = new ElementUtil(driver);
		util.waitWithFluentWait(username, 10, 2).sendKeys("batchautomation");
		util.waitWithFluentWait(password, 10, 2).sendKeys("Test@12345");
		util.waitWithFluentWait(login, 10, 2).click();
		
		driver.close();
		
		
	}

}
