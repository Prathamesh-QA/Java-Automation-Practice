/**
 * 
 */
package testngconcept;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author P.Dhamanaskar
 *
 */
public class TestcaseDesign {
	
	/**
	 * Testcase Designing - Steps
	 * 1. Global Pre-Condition
	 * 2. Testcase specific Pre-Condition
	 * 3. Test Steps (Testcase) + Exp vs Actual Result
	 * 4. Post Steps
	 * 5. Status -- PASS/FAIL/SKIP
	 * 6. Report
	 */
	//1st preference
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BS --- Connecting with Database");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BS --- Create a sample User");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BC --- Launch Browser Appln");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM --- Login to APP");
	}
	
	@Test
	public void homePageTitleTest() {
		System.out.println("Test --- Home Page Title Test");
		Assert.assertEquals("Google", "Google");	
	}
	
	@Test
	public void checkUserInfoTest() {
		System.out.println("Test --- User Info Test");
		Assert.assertEquals("Admin", "Admin");	
	}
	
	@Test
	public void homePageSearchTest() {
		System.out.println("Test --- Home Page Search Test");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AM --- Logout");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AC --- Close the Browser");
	} 
	
	@AfterTest
	public void afterTest() {
		System.out.println("AT --- Delete the User");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AS --- Diconnect from DB");
	}
	

}
