package example;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {

	@Test
	public void test2() throws InterruptedException {
		WebDriverService.getDriver().get("https://www.yahoo.com/");
		Thread.sleep(1000);
		assertEquals(WebDriverService.getDriver().getTitle(), "Yahoo");
		Reporter.log("Yahoo is running!");
	}
}