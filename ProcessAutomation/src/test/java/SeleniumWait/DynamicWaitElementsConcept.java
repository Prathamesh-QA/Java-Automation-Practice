package SeleniumWait;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaitElementsConcept {
	
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		By links = By.tagName("a");
		System.out.println(getPageElementsText(links,10));
	}
	
	/**
	 * A expectation of checking that all the relative locator present on the web page that 
	 * match the locator are visible
	 * Visibility means not only the elements are visible are but the height and width are 
	 * greater than 0
	 * @param locator
	 * @param timeOut
	 * @return list of WebElements which are located with match on webpage
	 */
	public static List<WebElement> visibilityOfAllElements(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * A expectation of checking that all the relative locator present on the web page that
	 * match the locator are visible then return the list of all the text of the elements
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<String> getPageElementsText(By locator,int timeOut) {
		List<String> list = new ArrayList<String>();
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator))
		.stream().forEach(element -> list.add(element.getText()));
		return list;
	}

}
