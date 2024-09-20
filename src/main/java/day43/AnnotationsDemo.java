package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	/*TC1
	 * login-@BeforeMethod
	 * search -@Test
	 * logout-@AfterMethod
	 * login
	 * advance search-@Test
	 * logout
	 */
    @BeforeMethod
	void login() {
		System.out.println("Login ");
	}
    @AfterMethod
	void logout() {
		System.out.println("Logout ");
	}
	@Test(priority=1)
	void basicSearch() {
		System.out.println("Basic Search");
	}
	@Test(priority=2)
	void advanceSearch() {
		System.out.println("Advance Search");
	}
}
