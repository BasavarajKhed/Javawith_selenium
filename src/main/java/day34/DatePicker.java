package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
//select future date
	static void SelectFutureDate(WebDriver driver, String year,String month,String date) {
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			List<WebElement> AllDates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td"));
			for (WebElement dt : AllDates) {
				if (dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
		}

	}

	static void SelectPastDate(WebDriver driver,String year, String month, String date) {
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			List<WebElement> AllDates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td"));
			for (WebElement dt : AllDates) {
				if (dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("09/04/2024");
		driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		String year="2022";
		String month="May";
		String date="12";
//		SelectFutureDate(driver, "year", "month", "date");
		SelectPastDate(driver, "year", "month", "date");
	}

}
