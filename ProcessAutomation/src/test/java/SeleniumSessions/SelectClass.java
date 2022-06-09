package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.xpath("//select[@name='Country']");
		
		Select select = new Select(driver.findElement(country));
		select.selectByVisibleText("Afghanistan");
		
		select.selectByIndex(4);
		select.selectByValue("Australia");
		
		List<String> countries =  select.getOptions().stream().map(e->e.getText()).collect(Collectors.toList());
		countries.forEach(ele -> System.out.println(ele));
		

	}

}
