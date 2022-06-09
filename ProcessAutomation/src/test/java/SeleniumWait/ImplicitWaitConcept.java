package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
	
	/*
	 * Wait in Selenium
	 * 1. Static Wait --> Thread.sleep(2000) //pass value in miliseconds
	 * 2. Dynamic Wait --> 
	 *    a) Implicitly Wait
	 *       This is a dynamic/global wait means it will be applied on all elements by default 
	 *       when element is created with FindElement/FindElements no need to apply for individual waits
	 *       Default value is 0
	 *       Whenever the element is loaded within 10 secs it will cancel out the remaining seconds will proceed with 
	 *       execution after desire applied wait the element is not found it will throw NoSuch Element Exception
	 *    b) Explicitly Wait   
	 *       b.1) WebDriver Wait
	 *       b.2) Fluent Wait
	 * 3. Default polling time: 500mS for eg if a implicit wait is of 10 Sec then the wait mechanism will check on the page 
	 *      whether the element is present or not the interval between each poll is 500mS
	 *       
	 *       
	 *    Disadvantages of Implicitly Wait:
	 *    1. Wait will be applied to all the elements which are created driver.findElement() / driver.findElements()
	 *    2. Although after 1st element wait all the elements are loaded on DOM after reading the HTML properties
	 *       even then as we had applied implicitly wait the mechanism will be called that many times and the wait is 
	 *       applied and then mechanism checks if the element is present/not if present then it will ignore the wait
	 *    3. It will be applied only for webelements not for non-webelements i.e title,url,alerts(js popup)
	 */
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		By username = By.xpath("//input[@name='email']");
		By password = By.xpath("//input[@name='password']");
		By login = By.xpath("//input[@value='Login']");
		
		WebElement u1 = driver.findElement(username);//10
		u1.sendKeys("prathameshqa1990@gmail.com");
		WebElement p1 = driver.findElement(password);//10
		p1.sendKeys("Automation@123");
		WebElement l1 = driver.findElement(login);//10
		l1.click();
		
	}

}
