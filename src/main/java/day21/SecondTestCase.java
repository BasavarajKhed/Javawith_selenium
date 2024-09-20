package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestCase {

	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
////		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
//		System.out.println(driver.getTitle());
		String act_tittle=driver.getTitle();
		
		if(act_tittle.equals("nopCommerce demo store")) {
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("Test failed");
		}
//		driver.close();
		
		driver.quit();

	}

}