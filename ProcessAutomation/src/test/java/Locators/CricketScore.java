/**
 * 
 */
package Locators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author P.Dhamanaskar
 *
 */
public class CricketScore {

	/**
	 * @param args
	 */
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-3rd-odi-1277084/full-scorecard");
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String playerName = "Rassie van der Dussen";
		System.out.println(getWicketTaker(playerName));
//		List<WebElement> scoreList = driver.
//				           findElements(By.xpath("//a[text()='Janneman Malan']//parent::td//following-sibling::td"));
//		
//		System.out.println(scoreList.size());
//		for(WebElement batsmen : scoreList) {
//			System.out.println(batsmen.getText());
//		}
		System.out.println(getScorecardList(playerName));
		driver.close();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
		public static String getWicketTaker(String batsmenName) {
		String element = "//a[text()='"+ batsmenName + "']//parent::td//following-sibling::td//span";
		return getElement(By.xpath(element)).getText();
	}
		public static int getRuns(String batsmenName) {
		String element = "//a[text()='"+ batsmenName + "']//parent::td//following-sibling::td[2]";
		return Integer.parseInt(getElement(By.xpath(element)).getText());
	}
	public static int getBallsPlayed(String batsmenName) {
		String element = "//a[text()='"+ batsmenName + "']//parent::td//following-sibling::td[3]";
		return Integer.parseInt(getElement(By.xpath(element)).getText());
	}
	public static int getStrikeRate(String batsmenName) {
		String element = "//a[text()='"+ batsmenName + "']//parent::td//following-sibling::td[7]";
		return Integer.parseInt(getElement(By.xpath(element)).getText());
	}
	public static int calculateStrikeRate(String batsmenName) {
		return (getRuns(batsmenName) / getBallsPlayed(batsmenName)) * 100;
	}
	public static List<String> getScorecardList(String batsmenName) {
		System.out.println("Getting score card of batsmen: " + batsmenName);
		List<String> scoreCardList = new ArrayList<String>();
		String element = "//a[text()='"+ batsmenName + "']//parent::td//following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(element));
		for(WebElement score : scoreList) {
			String val = score.getText();
			if(!val.isEmpty()) {
				scoreCardList.add(val);
			}
		}
		return scoreCardList;
	}

}
