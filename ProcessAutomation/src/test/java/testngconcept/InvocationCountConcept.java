/**
 * 
 */
package testngconcept;

import org.testng.annotations.Test;

/**
 * @author P.Dhamanaskar
 *
 */
public class InvocationCountConcept {
	
	@Test
	public void loginTest() {
		System.out.println("Login into Application");
	}
	
	@Test(invocationCount = 10)
	public void homePageHeaderTest() {
		System.out.println("Home Page header Test");
	}

}
