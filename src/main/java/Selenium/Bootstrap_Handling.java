package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Handling {

	public static void main(String[] args) {


		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\ajay7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		driver.findElement(By.xpath("//input[@value='jQuery']")).click();
	}

}
