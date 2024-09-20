package day35;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button = driver
				.findElement(By.xpath("//*[text()='right click me' and @class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		org.openqa.selenium.interactions.Action myaction=act.contextClick(button).build(); // building 
		myaction.perform();
//		Actions VS Action
//Actions-class,will be used to perform mouse actions
//	Action-interface, will be used to store created actions
		
	}

}
