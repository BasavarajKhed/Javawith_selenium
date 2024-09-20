package day26;
import org.openqa.selenium.By;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
//	String WId=driver.getWindowHandle();
//	System.out.println("Window Id" +WId); //Window IdE278561CFB8F2BC0859FC817E0283289//
		// getWindowHandles(); returns
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/div[2]/div/div[2]/div/div/p/a")).click(); // this will open new browser
		Set<String> ID = driver.getWindowHandles();
		System.out.println(ID);

	}
}
