package testngconcept;

import org.testng.ITest;
import org.testng.ITestMethodFinder;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AmazonAppTest {
	
	@Test(priority=0)
	public void addToCartTest() {
		System.out.println("add to cart test");
	}
	
	@Test(priority=1,enabled=true)
	public void paymentTest() {
		System.out.println("payment done!!!");
	}
	
	@Test(priority=2,enabled=true)
	public void skippedTest(ITest test) {
		throw new SkipException("Testcase Skipped: " + test.getTestName().toString());
	}

}
