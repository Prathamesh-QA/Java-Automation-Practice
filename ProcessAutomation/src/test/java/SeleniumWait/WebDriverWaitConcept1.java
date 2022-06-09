package SeleniumWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept1 {
	
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
		driver.get("https://www.kayak.co.in/?ispredir=true");
		System.out.println(waitForPageTitle("KAYAK",10));
		driver.close();
	}
	
	public static String waitForPageTitle(String title,int timeOut) {
		wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public static String waitForPageTitleToBe(String title,int timeOut) {
		wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

}
