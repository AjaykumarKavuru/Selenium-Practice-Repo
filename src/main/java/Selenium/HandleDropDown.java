package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown extends TestBase{

//	public static void main(String[] args) {
//		
//		System.setProperty("Webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\ajay7\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.ebay.com/");
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
//		select.selectByVisibleText("Art");
//		System.out.println("Handling dropdown using select class");
//	}
	
	public void dropdowntest() {
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		select.selectByVisibleText("Art");
		System.out.println("Handling dropdown using select class");
	}

}
