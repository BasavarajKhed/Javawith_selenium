package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();
// tag#id
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
//tag.classname input.search-box-text ui-autocomplete-input
//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("T-Shirts");
//driver.findElement(By.cssSelector(".input.search-box-text")).sendKeys("T-Shirts");
//tag[attribute='value']
//driver.findElement(By.cssSelector("input[placeholder=\'Search store\']")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("[placeholder=\'Search store\']")).sendKeys("T-shirts");
//tag class and attribuete
//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-Shirts");
driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("T-Shirts");



	}

}
