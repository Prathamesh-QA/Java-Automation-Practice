package webtable;

import java.util.*;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKart {
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		By columnHeader = By.xpath("//table[contains(@class,'table')]//th");
		
		/*
		 * Alogirthm
		 * 1. Click on Table header to sort the table contents in Ascending Order
		 * 2. Capture all the text of elements in the table in a list
		 * 3. apply sort on the original the list and create a copy called --> sorted list
		 * 4. Compare original list and sorted list 
		 */
		driver.findElement(columnHeader).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> list = elementList
				           .stream().map(element -> element.getText())
				           .collect(Collectors.toList());
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(list, sortedList);
		
		By next = By.cssSelector("[aria-label='Next']");
		List<String> price;
		List<WebElement> rows;
		int count=0;
		do {
			rows = driver.findElements(By.xpath("//tr/td[1]"));
			//traverse the table and find rice
			price = rows.stream()
			              .filter(element -> element.getText().contains("Rice"))
			              .map(element -> getPrice(element)).collect(Collectors.toList());
			price.forEach(ele -> System.out.println("Price: " + ele));
			if(price.size() < 1) {
				driver.findElement(next).click();
			}
			count++;
		}while(price.size() < 1);
		
		System.out.println(count);
		
		
		//If the table contains the pagination and we need to scroll down to other pages 
		//if item to be searched is not found in 1st page
		
		
		driver.close();
		
	}
	
	private static String getPrice(WebElement element) {
		By price = By.xpath("following-sibling::td[1]");
		return element.findElement(price).getText();
		
	}

}
