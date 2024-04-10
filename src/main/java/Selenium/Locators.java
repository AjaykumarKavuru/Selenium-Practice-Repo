package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		
//		driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//a[@id='create-account-link']")).click();
		driver.findElement(By.xpath("//input[@id='personalaccount-radio']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ajay");
		
		driver.close();
	}

}
