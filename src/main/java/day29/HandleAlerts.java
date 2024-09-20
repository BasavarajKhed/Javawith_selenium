package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		Normal alert handle
//		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
////		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
//		Alert myalert=driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
//		COnfermation Alert
//		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
//		Thread.sleep(5000);
////		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().accept();
		
//		Prompt alert-input box
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Basavaraj");
//		myalert.accept();
		myalert.dismiss();
	}

}
