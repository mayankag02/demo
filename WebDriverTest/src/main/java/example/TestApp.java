package example;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestApp {

	public static void main(String[] args) throws Exception {
		TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();

        String str = null;
        if (args[0].equalsIgnoreCase("Test1")) {
//    		str = "C:\\Users\\agarwam\\git\\demo\\WebDriverTest\\src\\main\\resources\\test1.xml";
    		str = "WebDriverTest/src/main/resources/test1.xml";
        }
        else if (args[0].equalsIgnoreCase("Test2")) {
//    		str = "C:\\Users\\agarwam\\git\\demo\\WebDriverTest\\src\\main\\resources\\test2.xml";
    		str = "WebDriverTest/src/main/resources/test2.xml";
        }
        suites.add(str);
        testng.setTestSuites(suites);
        testng.run();
	}
}