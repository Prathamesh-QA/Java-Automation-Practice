package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksStream {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links: " + links.size());
		
		List<String> urlList = new ArrayList<String>();
		for(WebElement element : links) {
			String url = element.getAttribute("href");
			urlList.add(url);
			//brokenLinks(url);
		}
		urlList.parallelStream().forEach(ele -> brokenLinks(ele));
		
		
	}
	
	public static void brokenLinks(String link) {
		try {
			URL url = new URL(link);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setConnectTimeout(5000);
			connection.connect();
			if(connection.getResponseCode() >= 400) {
				System.out.println("Broken Link: " + " " + url + " " + connection.getResponseMessage());
			}else {
				System.out.println(url + "--->" + connection.getResponseMessage());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
