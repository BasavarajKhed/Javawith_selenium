package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
    @Test
	void pqr() {
		System.out.println("This is from c3");
	}
    @BeforeSuite
    void bs() {
    	System.out.println("This is before suite");
    }
    @AfterSuite
    void as() {
    	System.out.println("This Is After suite");
    }
	
}
