/**
 * 
 */
package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author P.Dhamanaskar
 *
 */
public class AlertPopupHandle {

	/**
	 * @param JS Alert Popup
	 */
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		By jsAlert = By.xpath("//button[contains(text(),'Click for JS Alert')]");
		By jsConfirm = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
		By jsPrompt = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
		By result = By.id("result");
		driver.findElement(jsPrompt).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Naveen Sir");
		alert.accept();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(result).getText());
		
		driver.close();
		
	}
	

}
