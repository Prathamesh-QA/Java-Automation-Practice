package SeleniumWait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaitClickConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		By basicAlert = By.xpath("//button[text()='Click for JS Alert']");
		doActionsClickWhenReady(basicAlert, 10);
		Alert alert = waitForAlertPresence(10);
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
		
	}
	
	/**
	 * Wait for element to be visible and enabled such that you can click on it
	 * @param locator
	 * @param timeout
	 */
	public static void clickWhenReady(By locator,int timeout) {
		WebDriverWait wait  = new WebDriverWait(driver,timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	/**
	 * Wait for element to be visible and enabled such that you can click on it by performing some actions
	 * @param locator
	 * @param timeout
	 */
	public static void doActionsClickWhenReady(By locator,int timeout) {
		WebDriverWait wait  = new WebDriverWait(driver,timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	public static Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert();
	}

	

}
