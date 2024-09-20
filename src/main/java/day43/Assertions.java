package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	void testTittle() {
		String ex_tittle="Opencart";
		String act_tittle="Opencart";
		/*if(ex_tittle.equals(act_tittle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		*/
		if(ex_tittle.equals(act_tittle)) {
		System.out.println("Test Passed");
		Assert.assertTrue(true);
	}
	else {
		System.out.println("Test Failed");
		Assert.assertTrue(false);
	}
	
		//Assert.assertEquals(ex_tittle, act_tittle);
		
	}

}
