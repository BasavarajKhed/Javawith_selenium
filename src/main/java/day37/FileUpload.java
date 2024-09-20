package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
//		driver.findElement(By.xpath("//*[@id='filesToUpload']")).sendKeys("C:\\selenium_upload_file\\Upload_File.docx");
//		
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Upload_File.docx")) {
//			System.out.println("file is successfully uploaded");
//		}
//		else {
//			System.out.println("Upload failed");
//		}
		String file1 = "C:\\selenium_upload_file\\Upload_File.docx";
		String file2 = "C:\\selenium_upload_file\\Test2.docx";
		driver.findElement(By.xpath("//*[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		int noffiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if (noffiles == 2) {
			System.out.println("All files are uploaded");
		} else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}

//		validate file name
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Upload_File.docx")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.docx")) {
			System.out.println("Files name are Correct");
		} else {
			System.out.println("Files are not matching");
		}
	}

}
