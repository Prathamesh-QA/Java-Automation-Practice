package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {
	
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		takeElementScreenshot(driver);
	
	}
	
	public static String takeElementScreenshot(WebDriver driver) {
		String date = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "//Screenshots//" + date + ".png";
		File destinationFile = new File(destination);
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destination;
	}

}
