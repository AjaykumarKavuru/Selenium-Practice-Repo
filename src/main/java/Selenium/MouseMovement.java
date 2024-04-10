package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
		
		driver.findElement(By.xpath("//div[text()='You1st']")).click();
	}

}
