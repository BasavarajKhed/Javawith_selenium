package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) {

//		Your Store
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		String act_tittle = driver.getTitle();
//		System.out.println(act_tittle);
		if (act_tittle.equals("nopCommerce demo store")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test Failed");
		}
	}

}
