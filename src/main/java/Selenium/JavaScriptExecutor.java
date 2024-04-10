package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException {

		
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\ajay7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ajay7\\eclipse-workspace\\Selenium_Practice\\src\\main\\java\\Selenium\\config.properties");
		prop.load(ip);

		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
		
	}
	
	public static void flash(WebElement element,WebDriver driver) {
		JavaScriptExecutor js = ((JavaScriptExecutor)driver);
		String bgcolour = element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolour,element,driver);
		}
	}

	private static void changeColor(String colour, WebElement element, WebDriver driver) {
//		JavaScriptExecutor js = ((JavaScriptExecutor)driver);
//		js.executeScript(arguments[0].st)
		
	}

}
