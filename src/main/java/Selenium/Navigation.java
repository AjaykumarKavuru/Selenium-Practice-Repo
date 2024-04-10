package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ajay7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
