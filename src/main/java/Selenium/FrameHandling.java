package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://freecrm.com/");
//		driver.findElement(By.xpath("//span[text()='Log In']")).click();
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ajaykumar1044728@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

		driver.get("https://www.javatpoint.com/html-frame-tag");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='What is HTML']")).click();
	}

}
