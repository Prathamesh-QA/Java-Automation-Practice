package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coding3 {

	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) {
		
		/**
		 * Navigate to https://demoqa.com   

		Click on Elements 

 				Get List of Items under Elements 

 			Select Text Box 

 			Enter details and submit the form 

 			Fetch the output generated post submission 
		 */
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver, 5);
		
		WebElement elementLink = driver.findElement(By.xpath("//h5[text()='Elements']/parent::div/preceding-sibling::div[@class='card-up']"));
		WebElement textBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement address = driver.findElement(By.xpath("//input[@id='currentAddress']"));
		WebElement permAddress = driver.findElement(By.xpath("//input[@id='permanentAddress']"));
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		
		WebElement nameSelected = driver.findElement(By.xpath("//p[@id='name']"));
		WebElement emailSelected = driver.findElement(By.xpath("//p[@id='email']"));
		WebElement caddressSelected = driver.findElement(By.xpath("//p[@id='currentAddress']"));
		WebElement paddressSelected = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
				
		
		wait.until(ExpectedConditions.visibilityOf(elementLink));
		
		elementLink.click();
		
		wait.until(ExpectedConditions.visibilityOf(textBox));
		textBox.click();
		userName.sendKeys("Prathamesh");
		email.sendKeys("prathamesh@gmail.com");
		address.sendKeys("Pune");
		permAddress.sendKeys("Mumbai");
		submit.click();
		
		wait.until(ExpectedConditions.visibilityOf(nameSelected));
		
		System.out.println(nameSelected.getText());
		System.out.println(emailSelected.getText());
		System.out.println(caddressSelected.getText());
		System.out.println(paddressSelected.getText());
		
		
		
		
		
	}
	

	

	
	
	
	
	

}
