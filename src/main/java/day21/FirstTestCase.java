package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
	
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		String act_tittle=driver.getTitle();
		if(act_tittle.equals("Your Store")) {
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("Test failed");
		}
//		driver.close();
		
		driver.quit();

	}

}
