package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandleConcept {
	
	/**
	 * Switching from parent tab to child tab to shift the focus of driver to child tab
	 * 
	 */
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		By accessLink = By.xpath("//a[@class='blinkingText']");
		By username = By.xpath("//p[@class='im-para red']/child::strong/child::a");
		driver.findElement(accessLink).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String usernameCaptured = driver.findElement(username).getText();
		System.out.println(usernameCaptured);
		
		
		
		
	}

}
