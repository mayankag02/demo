package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {

	WebDriver driver = WebDriverService.getDriver();
	
	@Test
	public void test() {
		driver.get("https://www.google.com/");
		assertEquals(driver.getTitle(), "Google");
		Reporter.log("Google is running");
	}
}