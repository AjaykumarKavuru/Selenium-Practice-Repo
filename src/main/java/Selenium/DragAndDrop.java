package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();
		
	}

}
