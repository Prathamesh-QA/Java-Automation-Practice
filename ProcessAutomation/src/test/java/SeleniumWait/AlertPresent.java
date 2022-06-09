package SeleniumWait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPresent {
	
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		By basicAlert = By.xpath("//button[text()='Click for JS Alert']");
		driver.findElement(basicAlert).click();
		Alert alert = waitForAlertPresence(10);
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
	}
	
	public static Alert waitForAlertPresence(int timeOut) {
		wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert();
	}

}
