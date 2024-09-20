package day43;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class AnnotationsDemo2 {

	@BeforeClass
	void login() {
		System.out.println("Login ");
	}

	@AfterClass
	void logout() {
		System.out.println("Logout ");
	}

	@Test(priority = 1)
	void basicSearch() {
		System.out.println("Basic Search");
	}

	@Test(priority = 2)
	void advanceSearch() {
		System.out.println("Advance Search");
	}

}
