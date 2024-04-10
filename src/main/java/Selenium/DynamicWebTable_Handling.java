package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable_Handling {
	
	
	public static WebDriver driver= new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		
		int[][] arr = new int[300][100];

		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ajay7\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));
		System.out.println("No of rows = "+rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr[1]//td"));
		System.out.println("No of columns = "+Columns.size());
		
		DynamicWebTable_Handling DWHandling = new DynamicWebTable_Handling();
		DWHandling.Visited("Afghanistan");
		
		for (WebElement rowtext : rows) {
			System.out.println(rowtext.getText());
		}
		
	}
	
	public void Visited(String Country) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//strong[text()='"+Country+"']//preceding::input")).click();
		
	}

}
