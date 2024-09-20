package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BISB001.html");
		driver.manage().window().maximize();

		String filePath = System.getProperty("user.dir") + "\\TestData\\CalData.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		for (int i = 1; i <= rows; i++) {
//			Read data from excel
			String pric = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String fre = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);

//			Pass above data from excel
			driver.findElement(By.xpath("")).sendKeys(pric);
			driver.findElement(By.xpath("")).sendKeys(rateOfInterest);
			driver.findElement(By.xpath("")).sendKeys(per1);
			Select perdp = new Select(driver.findElement(By.xpath("")));
			perdp.selectByVisibleText(per2);
			Select fredrp = new Select(driver.findElement(By.xpath("")));
			perdp.selectByVisibleText(fre);
			driver.findElement(By.xpath("")).click(); // clicked on calculate

			// 3 validation
			String act_mvalue = driver.findElement(By.xpath("")).getText();
			if (Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue)) {
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			} else {
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("")).click();

		}
		driver.quit();

	}

}
