package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement contrydr = driver.findElement(By.xpath("//*[@id='country']"));
		Select contrydropdouwn = new Select(contrydr);
//		contrydropdouwn.selectByVisibleText("France");
//		contrydropdouwn.selectByValue("germany");
//		contrydropdouwn.selectByIndex(2);
//		Capture the options from the dropdown
		List<WebElement> options = contrydropdouwn.getOptions();
		System.out.println("Number of dropdown: " + options.size());
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
//		

		for (WebElement op : options) {
			System.out.println(op.getText());
		}

	}

}
