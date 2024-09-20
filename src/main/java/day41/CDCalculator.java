package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CDCalculator {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		String filePath = System.getProperty("user.dir") + "\\TestData\\CD_Data.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		for (int i = 1; i <= rows; i++) {
//			Read data from excel
			String in_deposit = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String length_cd = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String interest = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String compounding = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String total = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_value = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(in_deposit);
			driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c102-2']")).sendKeys(length_cd);
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(interest);
			Select perdp = new Select(driver.findElement(By.xpath("//div[@id='mat-select-value-1']")));
			perdp.selectByVisibleText(compounding);
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			
			
		}
		
	}

}
