package JavaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.JavaScriptUtil;

public class JavaScriptExecutorConcepts {
	
	static WebDriver driver;
	static JavaScriptUtil jsUtils;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		jsUtils = new JavaScriptUtil(driver);
		System.out.println(jsUtils.getTitleByJS()); // to get the tile of the page
		System.out.println(jsUtils.getPageInnerText()); //get page inner text
//		jsUtils.refreshBrowserByJS(); //refresh the page by JS
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		jsUtils.drawBorder(login);
		jsUtils.sendKeysByElement(username, "batchautomation");
		jsUtils.sendKeysUsingJSWithName("password", "Test@12345");
		//jsUtils.clickElementByJS(login);
		
		
		//driver.close();
		
		
		
		
	}

}
