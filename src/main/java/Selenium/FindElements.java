package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ajay7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.ebay.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
			String linkstext = links.get(i).getText();
			System.out.println(linkstext);
		}
		
		

	}

}
