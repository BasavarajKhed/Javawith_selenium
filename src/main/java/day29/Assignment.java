package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> checkboxs = driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (int i = 7; i <=checkboxs.size(); i++) {
			checkboxs.get(i).click();
		}
		
				

	}

}
