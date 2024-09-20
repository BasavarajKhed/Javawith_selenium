package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	SoftAssert sa;

	/*
	 * @Test void test_hardassertions() { 
	 * System.out.println("Test");
	 * System.out.println("Test"); 
	 * Assert.assertEquals(1, 2);
	 * System.out.println("Test"); 
	 * System.out.println("Test"); }
	 */

	@Test
	void test_softassertions() {
		System.out.println("Test");
		System.out.println("Test");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("Test");
		System.out.println("Test");
		sa.assertAll(); // mandatory to close then only testcase will pass
		
	}

}
