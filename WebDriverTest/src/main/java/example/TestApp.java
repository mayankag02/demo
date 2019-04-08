package example;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestApp {

	public static void main(String[] args) throws Exception {
		TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
//        String str = "src/main/resources/test1.xml";
        String str = null;
        if (args[0].equalsIgnoreCase("Test1")) {
    		str = "C:\\Users\\agarwam\\eclipse-workspace\\WebDriverTest\\src\\main\\resources\\test1.xml"; //Use while running Jar
    		System.out.println("Test1");
//    		String str = "src/main/resources/test1.xml"; //Use while running as Java app
        }
        else if (args[0].equalsIgnoreCase("Test2")) {
    		str = "C:\\Users\\agarwam\\eclipse-workspace\\WebDriverTest\\src\\main\\resources\\test2.xml"; //Use while running Jar
//    		String str = "src/main/resources/test2.xml"; //Use while running as Java app
    		System.out.println("Test2");
        }
        suites.add(str);
        testng.setTestSuites(suites);
        testng.run();
	}
}