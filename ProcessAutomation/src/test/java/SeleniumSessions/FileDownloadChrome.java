package SeleniumSessions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownloadChrome {
	
	static WebDriver driver;
	File folder;
	
	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		//UUID generates the folder system such as 888-4884-9423-9573
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();  // this will create the directory 
		
		//for chrome: this configuraion states the driver to download
		// the file in specified system directory
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String,Object> preference = new HashMap<String,Object>();
		preference.put("profile.default_content_settings.popups", 0); //no popup should be populated on UI when any download link is clicked
		preference.put("download.default_directory", folder.getAbsolutePath()); // this will tell to download in a specific directory
		
		options.setExperimentalOption("prefs", preference);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(capabilities); 
	}
	
	@Test(priority=1)
	public void fileDownloadTest() {
		driver.get("https://the-internet.herokuapp.com/download");
		By fileLink = By.linkText("SamplePNGImage_100kbmb.png");
		driver.findElement(fileLink).click();
		
		//wait for 3 secs
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File[] listOfFiles  = folder.listFiles();
		//check whether the directory is not empty
		Assert.assertTrue(listOfFiles.length > 0);
		// check whether the file size is not empty
		for(File file : listOfFiles) {
			Assert.assertTrue(file.length() > 0);
		}
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
		for(File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}
	
	
	
}
