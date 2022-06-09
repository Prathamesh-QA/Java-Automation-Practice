/**
 * 
 */
package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author P.Dhamanaskar
 *
 */
public class CustomXpath1 {

	/**
	 * XPath is address of element inside DOM
	 * Absolute XPath : Complete path of the element inside the DOM (Not Recommended) because of risk
	 *                  which can change the XPath due to any updates
	 *                  traversing from parent node to the target element html tag
	 *                  eg: /html/body/header/div/div/div[2]/div/input
	 * Relative/Custom XPath : XPath with some attributes/function
	 *                         //html_tagName[@attribute='attributeValue'] -- 1 of 1 (single element) 1 of many (multiple element)
	 *                         
	 *                         1 attribute
	 *                         email-text box: //input[@name='email'] or
	 *                                         //input[@id='input-email']
	 *                        2 attribute
	 *                                        //input[@type='text' and @id='input-email']
	 *                                        
	 *   functions in Xpath 
	 *   1. text() ---> //h3[text()='Companies & Contacts'] // any element having text which do not have any attribute
	 *                  //a[text()='Solutions']
	 *      xpath with attribute and text function
	 *      formula: //tagname[@attr='value' and text()='textval']
	 *      eg: //span[@class='description js-validator' and text()='Pick a']
	 *      
	 *   2. indexing in XPath:
	 *      if the XPath which found has 1 of many elements present then in that case we should use indexes to get the exact xpath
	 *      (//input[@type='text'])[index-of-element]
	 *       eg: (//input[@class='form-control'])[5]
	 *       you can mention the position of the element also
	 *   3. position()
	 *      we can specify the position of element by specifying the index to the position
	 *      formula: //tagname[@attr='value'])[position()=indexOfElement]
	 *      eg: //input[@class='form-control'])[position()=1]
	 *      
	 *   4. last()
	 *      we can specify the last element in the group of elements created by xpath by using last() function
	 *      eg://input[@class='form-control'])[last()]
	 *      
	 *   5. contains()
	 *      it specifically used for dynamic attributes so to find the xpath based on the static attributes we can use contains function
	 *      formula: //tagname[contains(@attr,'value')]
	 *      eg: //input[contains(@class,'input-lg')]
	 *      
	 *      contains() function with text function:
	 *      formula: //tagname[contains(text(),'text')]
	 *      eg: //span[contains(text(),'My')]
	 *      
	 *   6. starts-with()
	 *      if there is a dynamic id present on dom such as message123/message213/message435
	 *      formula : //tagname[starts-with(@id,'message')]
	 *                //div[starts-with(@id,'message')]
	 *      
	 *   7. text()
	 *      formula: //tagname[text()='value']
	 *               //td[text()='value']
	 *      
	 */
	static WebDriver driver;

	
	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://classic.crmpro.com/index.html");
			driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			By text = By.xpath("//small[contains(text(),'visibility')]");
			System.out.println(driver.getTitle());
			System.out.println(driver.findElement(text).getText());
			driver.close();
			
	}

}
