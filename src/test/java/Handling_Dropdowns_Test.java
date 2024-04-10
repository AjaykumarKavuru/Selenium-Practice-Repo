import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Selenium.HandleDropDown;

public class Handling_Dropdowns_Test {
	WebDriver driver;
	@Test
	public void dropdownval() {
		HandleDropDown handlingdropdown = new HandleDropDown();
		handlingdropdown.dropdowntest();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
