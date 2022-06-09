package webtable;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKartFilterTest {
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		By columnHeader = By.xpath("//table[contains(@class,'table')]//th");
		By name = By.xpath("//tr/td[1]");
		//Enter value to be searched in webtable
		By searchField = By.cssSelector("input#search-field");
		driver.findElement(searchField).sendKeys("Rice");
		//Now get all the element name from webtable in list
		List<WebElement> names = driver.findElements(name);
		List<WebElement> filteredNames =  names.stream()
									     .filter(ele -> ele.getText().contains("Rice"))
									     .collect(Collectors.toList());
		Assert.assertEquals(names.size(), filteredNames.size());
		
		driver.close();
		
	}

}
