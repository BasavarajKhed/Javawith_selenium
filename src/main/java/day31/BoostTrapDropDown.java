package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoostTrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		List<WebElement> option = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of Options " + option.size());
//		for(WebElement op:option) {
//			System.out.println(op.getText());
//		}
		
		for(WebElement op:option) {
			String option1=op.getText();
			if(option1.equals("Java")||option1.equals("Python")||option1.equals("MySQL"))
					{
				op.click();
				
			}
		}
	}

}
