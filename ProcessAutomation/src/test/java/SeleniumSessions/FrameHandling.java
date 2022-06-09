/**
 * 
 */
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author P.Dhamanaskar
 *
 */
public class FrameHandling {

	/**
	 * Frame Handling : Frame is webelement which can be used to switch the driver to frame. Frame has its own 
	 *                  webelements and frame can be switched by using driver.switchTo()
	 *                  Frame can be switched by index/name/webelement
	 */
	
	static WebDriver driver;
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//Switching to frame
		driver.switchTo().frame("main");
		By header = By.xpath("//body[@bgcolor='red']/h2");
		System.out.println(driver.findElement(header).getText());
		driver.switchTo().defaultContent();
		driver.close();
		

		
	}

}
