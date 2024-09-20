package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	@BeforeSuite
	void bs() {
		System.out.println("This is before suite");
	}

	@AfterSuite
	void as() {
		System.out.println("This Is After suite");
	}

	@BeforeTest
	void bt() {
		System.out.println("This is Before Test");
	}

	@AfterTest
	void at() {
		System.out.println("This is After Test");
	}

	@BeforeClass
	void bc() {
		System.out.println("BC");
	}

	@AfterClass
	void ac() {
		System.out.println("AC ");
	}

	@BeforeMethod
	void bm() {
		System.out.println("b m ");
	}

	@AfterMethod
	void af() {
		System.out.println("a m");
	}
	
	@Test(priority=1)
	void tm1() {
		System.out.println("m1");
	}
	@Test(priority=2)
	void tm2() {
		System.out.println("m2");
	
	}
}
