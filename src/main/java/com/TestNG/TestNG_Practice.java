package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_Practice {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

	@Test(priority = 1,groups = "PIM")
	public void PIM() {
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]")).click();
	}
	@Test(priority = 1,groups = "Leave")
	public void Leave() {
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[3]")).click();
	}
	@Test(priority = 1,groups = "Time")
	public void Time() {
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[4]")).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
