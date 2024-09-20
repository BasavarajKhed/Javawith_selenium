package day41;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
		driver.findElement(By.xpath("//*[@class='mat-form-field-infix ng-tns-c102-1']//input")).clear();
		driver.findElement(By.xpath("//*[@class='mat-form-field-infix ng-tns-c102-2']//input")).clear();

		WebElement dropdownElement = driver.findElement(By.xpath("//*[@class='mat-select-arrow ng-tns-c109-4']"));
		dropdownElement.clear();
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("500");
		driver.findElement(By.xpath("//*[@class='mat-form-field-infix ng-tns-c102-1']//input")).sendKeys("24");
		driver.findElement(By.xpath("//*[@class='mat-form-field-infix ng-tns-c102-2']//input")).sendKeys("2");
		WebElement dropdownElement1 = driver.findElement(By.xpath("//*[@class='mat-select-arrow ng-tns-c109-4']"));
		Select perdp = new Select(dropdownElement1);
		perdp.selectByVisibleText("Compounded Monthly");

		driver.findElement(By.xpath("//*[@type='submit']//div")).click();
	}

}
