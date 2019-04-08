package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {

	WebDriver driver = WebDriverService.getDriver();
	
	@Test
	public void test() {
		driver.get("https://www.linkedin.com/");
		assertEquals(driver.getTitle(), "LinkedIn: Log In or Sign Up");
		Reporter.log("LinkedIn is running");
	}


}
