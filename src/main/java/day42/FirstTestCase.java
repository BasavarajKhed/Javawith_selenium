package day42;

import org.testng.annotations.Test;

/*
 * Open Application
 * Login 
 * Logout
 */

public class FirstTestCase
{
	@Test(priority=1)
	void logout() {
		System.out.println("Logout success fully");
	}
    
    @Test(priority=0)
	void login() {
		System.out.println("Login application");
	}
    
    
    @Test(priority=-1)
   	void opeApp() {
   		System.out.println("Open application");
   	}

}
