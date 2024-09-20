package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
//		Minimum Slider
		WebElement min_slider = driver
				.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("Default Location of the min slider " + min_slider.getLocation());
//		Default Location of the min slider (59, 249)
//		Location of the min slider after moving(158, 249)
		act.dragAndDropBy(min_slider, 100, 249).perform();
		System.out.println("Location of the min slider after moving" + min_slider.getLocation());

//		Max Slider
		WebElement Max_Slider = driver
				.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("Defaukt location for max slider :" + Max_Slider.getLocation()); // Defaukt location for max slider :(510, 249)
		act.dragAndDropBy(Max_Slider, -100, 249).perform();
		System.out.println("Location of the max slider after moving" + Max_Slider.getLocation());
//		Defaukt location for max slider :(510, 249)
//		Location of the max slider after moving(510, 249)
		
		
	}

}
