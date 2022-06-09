package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksStream {
	
	static WebDriver driver;
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		By links = By.tagName("a");
		
		List<WebElement> linksList = driver.findElements(links);
		
		List<String> linksText = linksList.stream()
								.filter(ele -> !ele.getText().equals("") && ele.getText().startsWith("M"))
								.map(ele -> ele.getText())
								.collect(Collectors.toList());
		linksText.parallelStream().forEachOrdered(link -> System.out.println(link));
		driver.close();
		
	}

}
