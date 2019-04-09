package example;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {

	@Test
	public void test1() throws InterruptedException {
		WebDriverService.getDriver().get("https://www.youtube.com/");
		Thread.sleep(1000);
		assertEquals(WebDriverService.getDriver().getTitle(), "YouTube");
		Reporter.log("YouTube is running!");
	}
}