package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListWithStream {
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By countryOptions = By.xpath("//select[@name='Country']/option");
		By countrySelect = By.xpath("//select[@name='Country']");
		
		List<WebElement> countryList = driver.findElements(countryOptions);
		//sequential stream
		//countryList.stream().forEach(ele -> System.out.println(ele.getText()));
		//parallel stream
		countryList.parallelStream().forEachOrdered(ele -> System.out.println(ele.getText()));
		
//		Select selectCountry = new Select(driver.findElement(countrySelect));
//		selectCountry.selectByVisibleText("Romania");
		
		
		//driver.close();

	}

}
