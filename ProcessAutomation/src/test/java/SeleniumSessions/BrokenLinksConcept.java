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

public class BrokenLinksConcept {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//links will have a and img tags will contain a href attribute
		//psuedo code:
		/*
		 * 1. gather all the links in which has a tag in arrayList
		 * 2. add all the img tags to the above arrayList
		 * 3. remove the links which are having empty href properties
		 * 4. now get the attributes and check each link
		 * 5. check the href url, with httpconnection api
		 * 
		 */
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		// get size of all links
		System.out.println(linksList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		//iterate the linkList
		for(int i=0;i<linksList.size();i++) {
			if(linksList.get(i).getAttribute("href") != null) {
				activeLinks.add(linksList.get(i));
			}
		}
		//get size of active links
		System.out.println(activeLinks.size());
		
		//check the href url using httpconnection
		// 200 Ok
		// 404 Not Found
		// 500 Internal Server Error
		
		for(int i=0;i<activeLinks.size();i++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(i).getAttribute("href")).openConnection();
			connection.connect();
			System.out.println(activeLinks.get(i).getAttribute("href") + ": " + connection.getResponseCode() + ", " + connection.getResponseMessage());
			connection.disconnect();
		}
		

		
		
	}

}
