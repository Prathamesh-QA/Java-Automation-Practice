package testngconcept;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {
	int age = 10;
	/*
	 * 1. Whenever there is an exception in the test method it will fail the Testcase
	 *    to avoid the failure of testcase because of java exceptions 
	 * 2. using TestNG helper attribute : expectedException = ArithmeticException.class
	 *    we can avoid the Testcase failure
	 */
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void aTest() {
		System.out.println("A -- Test");
		int i = 9/0;
		ExpectedExceptionsConcept obj = new ExpectedExceptionsConcept();
		obj = null;
		System.out.println(obj.age);
	}

	
	

}
