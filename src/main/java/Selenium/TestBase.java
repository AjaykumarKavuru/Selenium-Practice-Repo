package Selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public void launchBrowser() {
//		System.setProperty("Webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\ajay7\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver = new EdgeDriver();
	}
}
