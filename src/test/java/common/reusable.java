package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileReader;
import java.util.Properties;


public class reusable {






public WebDriver createDriverInstance(){
	
	WebDriver driver = null;

	if (getGlobalData("browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
	}
	
	if (getGlobalData("browser").equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		
	}
	
	
		
//System.setProperty("webdriver.chrome.driver","/Users/mithunroy/Downloads/ChromeDriver_118/chromedriver");
//WebDriver driver = new ChromeDriver();
return driver;
}


public String getGlobalData(String key){


String value = null;
try {
FileReader reader = new FileReader("C:\\Eclipse Project\\Test.learning.selenium\\testData.properties");
Properties prop = new Properties();
prop.load(reader);
value = prop.getProperty(key);
}
catch(Exception e){}


return value;
}


}
