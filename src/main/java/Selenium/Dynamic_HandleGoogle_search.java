package Selenium;

import java.time.Duration;
//import java.time.Duration;
import java.util.NoSuchElementException;

//import org.bouncycastle.asn1.eac.Flags;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_HandleGoogle_search {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.timeanddate.com/calendar/monthly.html");
		
		String BeforeXpath = "//table[@class='ca ca2']//tbody//tr[";
		String AfterXpath = "]//td[";
		int Total_No_of_weekDays = 7;
		
		int date = 31;
		boolean flag = false;
		String arr = null;
		
		for(int i=1;i<=6;i++) { 
			for(int j=1;j<=Total_No_of_weekDays;j++) {
				
				try {
				 arr = driver.findElement(By.xpath(BeforeXpath+i+AfterXpath+j+"]")).getText();
				}catch (NoSuchElementException e) {
					System.out.println("Enter correct value");
					flag = false;
					break;
				}
				System.out.println(arr);
				
				if(arr.equals(date)) {
					driver.findElement(By.xpath(BeforeXpath+i+AfterXpath+j+"]")).click();
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		
		
	}

}
