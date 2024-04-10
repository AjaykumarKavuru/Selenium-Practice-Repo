package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Chrome {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\ajay7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		
//		if(Title.equals("Google")) {
//			System.out.println("Correct");
//		}else {
//			System.out.println("Incorrect");
//		}
//		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.close();
	}

}
