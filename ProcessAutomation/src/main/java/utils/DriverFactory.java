package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.enums.BrowserType;

public final class DriverFactory {
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		if(BrowserType.CHROME == browserType) {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}else if(BrowserType.FIREFOX == browserType) {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}else if(BrowserType.EDGE == browserType) {
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		}else throw new RuntimeException("Please select appropriate Browser.");
	}

}
