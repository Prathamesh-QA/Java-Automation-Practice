package testngconcept;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	@BeforeTest
	public void setExtentReporting() {
		//2 Parameters in ExtentReports Constructor
		//1. path of the html file: directory to generate extent report
		//2. true/false : true=replace the existing html file
		Map<String,String> systemInfo = new HashMap<String,String>();
		systemInfo.put("Host Name", "PNQB5859 Win10");
		systemInfo.put("Username", "PNQB5859");
		systemInfo.put("Environment", "DEV Integration");
		
		extent = new ExtentReports(System.getProperty("user.dir") + "//test-output//Automation-Report.html",true);
		extent.addSystemInfo(systemInfo);
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	public static String getScreenshotPath(WebDriver driver,String screenShotName) {
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + System.getProperty("file.separator") +"failedTestScreenshots"+ System.getProperty("file.separator")
		               + screenShotName + date + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyDirectory(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
	}
	
	@BeforeMethod()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod()
	public void tearDown(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) { //ITestResult.Failure == 2(int)
			extentTest.log(LogStatus.FAIL, "Failed Testcase: "+ result.getName()); // this will print the testcase name
			extentTest.log(LogStatus.FAIL, result.getThrowable()); // this will print the exception which caused the testcase to fail
			String screenshotPath = getScreenshotPath(driver, result.getName()); //taking screenshot path
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); // attach the screenshot
		}else if (result.getStatus() == ITestResult.SKIP) { //ITestResult.Failure == 3(int)
			extentTest.log(LogStatus.SKIP, "Skipped Testcase: " + result.getName());
		}else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Testcases Passed: " + result.getName());
		}
		extent.endTest(extentTest);	//ending the testcase
		
		driver.close();
	}

}
