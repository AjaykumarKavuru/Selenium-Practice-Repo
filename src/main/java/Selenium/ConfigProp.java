package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigProp {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ajay7\\eclipse-workspace\\Selenium_Practice\\src\\main\\java\\Selenium\\config.properties");
		prop.load(ip);
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
//		String User = prop.getProperty("UserName");
//		String Pwd = prop.getProperty("Password");
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
	}

}
