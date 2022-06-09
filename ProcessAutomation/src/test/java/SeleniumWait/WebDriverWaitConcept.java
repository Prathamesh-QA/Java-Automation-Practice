package SeleniumWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {
	
	/*
	 * WebDriver Wait is a customized wait it is a type of Explicit Wait
	 * 1. Web Driver wait extends FluentWait 
	 * 2. WebDriver Wait and Fluent Wait implementing Wait Interface
	 * 3. Dynamic Wait if element is found in 5 sec then it will return and stop waiting
	 * 4. WebDriver wait not only provides wait for webelements but also for non-webelements
	 *    which are alerts,title,frame
	 */
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		wait = new WebDriverWait(driver,10,2);
		wait.until(ExpectedConditions.titleContains("Your Store"));
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
