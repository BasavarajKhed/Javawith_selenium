package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		List<WebElement> checkboxs = driver
				.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
//		for(int i=0;i<checkboxs.size();i++) {
//			checkboxs.get(i).click();
//		}
//	for(WebElement checkbox: checkboxs ) {
//		checkbox.click();
//		
//	}
//	Select last three check box 
//	total number of checkboxes -how many checkboxes want to select =start index
//	7-3=4 start index
//		for (int i = 4; i < checkboxs.size(); i++) {
//			checkboxs.get(i).click();
//		}

//		for (int i = 2; i < 5; i++) {
//			checkboxs.get(i).click();
//		}

		for (int i = 0; i < 3; i++) {
			checkboxs.get(i).click();
		}
		Thread.sleep(5000);
		for (int i = 0; i < checkboxs.size(); i++) {
			if (checkboxs.get(i).isSelected()) {
				checkboxs.get(i).click();
			}
		}

	}

}
