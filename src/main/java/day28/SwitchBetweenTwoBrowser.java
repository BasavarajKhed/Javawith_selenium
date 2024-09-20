package day28;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenTwoBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIds = driver.getWindowHandles();
//Approach1
		/*
		 * List<String> windowlist=new ArrayList(windowIds); String
		 * parentId=windowlist.get(0); String childId=windowlist.get(1);
		 * 
		 * driver.switchTo().window(childId); System.out.println(driver.getTitle());
		 * driver.switchTo().window(parentId); System.out.println(driver.getTitle());
		 */
		//Approach2
		for (String winID : windowIds) {
			String title = driver.switchTo().window(winID).getTitle();
			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
