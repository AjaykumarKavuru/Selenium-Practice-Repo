package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");

		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://www.spicejet.com/");
		
//		ChromeOptions options = new ChromeOptions();
		
		
		System.out.println(driver.getTitle());
	}

}
