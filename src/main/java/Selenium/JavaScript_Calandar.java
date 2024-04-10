package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class JavaScript_Calandar {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		
		WebElement date = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]"));
		System.out.println(date.getText());
		String dateval = "Wed, 20 Mar 2024";
		
		selectdate(driver, date, dateval);
		
	}
	
	public static void selectdate(WebDriver driver,WebElement element,String Dateval) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '"+Dateval+"');", element);
		
//		 String script = "arguments[0].setAttribute('value', arguments[1]);";
//		    js.executeScript(script, element, Dateval);
		
	}

}
