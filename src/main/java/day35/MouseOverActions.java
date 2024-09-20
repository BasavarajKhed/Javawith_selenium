package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktops=driver.findElement(By.xpath("//*[text()='Desktops' and @class='nav-link dropdown-toggle']"));
		WebElement mac=driver.findElement(By.xpath("//*[text()='Mac (1)' and @class='nav-link']"));
		Actions act=new Actions(driver);
		//Mouse Over Actions
//		act.moveToElement(desktops).moveToElement(mac).click().build().perform();
//		build-create action perform-perform action
		act.moveToElement(desktops).moveToElement(mac).perform();
		
		

	}

}
