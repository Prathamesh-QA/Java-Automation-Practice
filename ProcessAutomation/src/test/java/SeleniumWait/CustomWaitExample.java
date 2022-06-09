package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class CustomWaitExample {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By username = By.xpath("//input[@name='email']");
		By password = By.xpath("//input[@name='password']");
		By login = By.xpath("//input[@value='Login']");
		
		ElementUtil utils = new ElementUtil(driver);
		utils.retryingElement(username)
		     .sendKeys("prathameshqa1990@gmail.com");
		utils.retryingElement(password)
		     .sendKeys("Test@12345");
		utils.retryingElement(login)
		     .click();
		
	}

}
