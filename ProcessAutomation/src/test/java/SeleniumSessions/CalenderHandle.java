package SeleniumSessions;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderHandle {
	
	static WebDriverWait wait;
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		wait = new WebDriverWait(driver,10,2);
		
		By calender = By.xpath("//input[@placeholder='Depart' and contains(@class,'c-input')]");
		By calenderNavigator = By.xpath("//div[@class='rd-date']");
		
		driver.findElement(calender).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(calenderNavigator));
		
		
		//selection of from date
		List<WebElement> fromDates = driver.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class,'day')]"));
		for(WebElement date : fromDates) {
			if(date.getText().equals("27")) {
				date.click();
				break;
			}
		}
		
		//selection of to date
		List<WebElement> toDates = driver.findElements(By.xpath("(//div[@class='rd-month'])[2]/table//div[contains(@class,'day')]"));
		for(WebElement date : toDates) {
			if(date.getText().equals("")) {
				date.click();
			}
		}
		
		
		
	}

}
