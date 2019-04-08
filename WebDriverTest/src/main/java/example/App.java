package example;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class App {

	public static void main(String[] args) throws Exception {
		TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        
		String str = "C:\\Users\\agarwam\\eclipse-workspace\\WebDriverTest\\src\\main\\resources\\test.xml"; //Use while running Jar
//		String str = "src/main/resources/test.xml"; //Use while running as Java app
        
        suites.add(str);
        testng.setTestSuites(suites);
        testng.run();
	}
}