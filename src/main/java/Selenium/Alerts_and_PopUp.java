package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_and_PopUp {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\ajay7\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		String PopUpMessage = driver.switchTo().alert().getText();
//		System.out.println(PopUpMessage);
//		driver.switchTo().alert().accept();

		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		
		if(alerttext.equals("Please enter a valid user name")) {
			System.out.println("Match");
		}
		else {
			System.out.println("Not Matched");
		}
		alert.accept();
	}

}
