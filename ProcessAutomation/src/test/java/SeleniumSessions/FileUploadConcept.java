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
public class FileUploadConcept {

	/**
	 * @param File Upload: Whenever the Upload button has a Input html tag and type=file attribute
	 * then we can directly use send keys and send the file location the file will be caught by selenium
	 *                     
	 */
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		By fileUpload = By.xpath("//input[@name='upfile']");
		
		driver.findElement(fileUpload).sendKeys("C:\\Users\\p.dhamanaskar\\Documents\\Miscellaneous\\Pics\\BAT-1.png");
		
		//driver.close();

	}

}
