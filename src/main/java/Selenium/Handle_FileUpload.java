package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\ajay7\\Downloads\\Chegg_Q_A_Guideline_Version_26.pdf");
		
	}

}
