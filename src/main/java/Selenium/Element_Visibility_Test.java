package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Visibility_Test {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		boolean btndisplayed_status = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(btndisplayed_status);
		
		boolean btnenabled_status = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(btnenabled_status);
		
		boolean btnselected_status = driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
		System.out.println(btnselected_status);
	}

}
