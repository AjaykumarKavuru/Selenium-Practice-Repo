package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.driver.chrome", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String Parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> WindowHandle = driver.getWindowHandles();
		for (String Window : WindowHandle) {
			System.out.println(Window +" " + driver.getTitle());
			
			if(!Window.equals(Parentwindow)) {
				
				driver.switchTo().window(Window);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Ajay");
				driver.close();
			}
			
			driver.switchTo().window(Parentwindow);
			driver.findElement(By.id("name")).sendKeys("ParentWindow");
		}
		
		

	}

}
