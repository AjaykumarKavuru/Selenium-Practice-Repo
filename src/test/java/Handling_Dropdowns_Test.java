import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.HandleDropDown;
import Selenium.TestBase;

public class Handling_Dropdowns_Test extends TestBase{
	@BeforeMethod
	public void setup() {
		launchBrowser();
	}
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
