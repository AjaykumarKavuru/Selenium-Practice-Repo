package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		ExplicitWait(driver, driver.findElement(By.linkText("Gmail")), Duration.ofSeconds(20));
		

	}
	
	public static void ExplicitWait(WebDriver driver, WebElement locator, Duration timeoutDuration)  {
		
		new WebDriverWait(driver, timeoutDuration).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
