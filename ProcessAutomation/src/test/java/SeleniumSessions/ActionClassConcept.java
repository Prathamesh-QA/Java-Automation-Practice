package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		By userName = By.id("input-username");
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By countrySelector = By.id("input-country");
		By loginLink = By.linkText("Login");
		
		doActionsSendKeys(userName, "Naveen");		
		doActionsSendKeys(userName, "Khunteta");
		doActionsClick(loginLink);
		
		driver.close();

	}
	
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	private static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
		
	}
	
	private static void doActionsSendKeys(By locator,String text) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator),text).perform();
		
	}
	
	
	

}
