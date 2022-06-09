/**
 * 
 */
package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author P.Dhamanaskar
 *
 */
public class OpeningSeperateTab {

	/**
	 * 
	 */
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		By links = By.tagName("a");
		System.out.println("Entire Page Links Count: " + driver.findElements(links).size());
		
		WebElement footerDriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println("Footer Page Links Count: " + footerDriver.findElements(links).size());
		
		//narrow the driver scope to 1st column
		WebElement column1 = footerDriver.findElement(By.xpath("//table[@class='gf-t']//ul"));
		int footerLinksCount = column1.findElements(links).size();
		System.out.println("Column-1 links count: " + footerLinksCount);
		
		//open all the tabs
		for(int i=0;i<footerLinksCount;i++) {
			String clickOnNewTab = Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);
			column1.findElements(links).get(i).sendKeys(clickOnNewTab);
			Thread.sleep(3000L);
		}
		// it will switch to all tab and get the title
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
