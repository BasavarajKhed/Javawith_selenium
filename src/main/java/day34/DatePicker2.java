package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.Select;
public class DatePicker2 {

	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("Novemeber", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		Month vmonth = monthMap.get(month);
		if (vmonth == null) {
			System.out.println("Invalid month...");
		}
		return vmonth;

	}

	static void SelectDate(WebDriver driver, String requiredyear, String requiredmonth, String requireddate) {
		WebElement yeardropdowm = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		Select selectyear = new Select(yeardropdowm);
		selectyear.selectByVisibleText(requiredyear);

//		select month
		while (true) {
			String displayMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
//		convert required month and display in to month objects 

			Month expectedMonth = convertMonth(requiredmonth);
			Month currentMonth = convertMonth(displayMonth);

//		compare
			int result = expectedMonth.compareTo(currentMonth);
			// 0 months are equal
			// >0 future month
			// <0 past month
			if (result < 0) {
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else if (result > 0) {
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else {
				break;
			}

		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
		for (WebElement dt : allDates) {
			if (dt.getText().equals(requireddate)) 
			{
				dt.click();
			break;

		}

	}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String requiredyear = "2025";
		String requiredmonth = "June";
		String requireddate = "15";

		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
//		driver.findElement(By.xpath("//iframe[@id='frame-one796456169']")).click();
		SelectDate(driver,requiredyear,requiredmonth,requireddate);

	}

}
