/**
 * 
 */
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author P.Dhamanaskar
 *
 */
public class AuthPopupConcept {

	/**
	 * Authorization Popup: 
	 */
	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By successMessage = By.xpath("//div[@class='example']/p");
		System.out.println(driver.findElement(successMessage).getText());
		driver.close();
		
		
		
	}

}
