package espn.Framework.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class espnWebSetup {
	//This class will instantiate the WebDriver based on input from the test(s).
	
	
	static WebDriver driver;
	static String driverPath = "C:\\Users\\hicksa\\Documents\\Selenium\\drivers\\";
	
	
	 public static WebDriver setupDriver(String browser, String url) {
		 //Based on the input from the test, set the WebDriver to use Chrome or Firefox. 
		 //If the browser is unrecognized, it will default to Chrome.
		 switch (browser) {
		 case "chrome":
			 System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			 driver = new ChromeDriver();	 
		 break;
		 case "firefox":
			 //This should work, but doesn't for some reason.
			 System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
			 driver = new FirefoxDriver();			 
	     break;
		 case "ie":
			 //This does not work yet either.
			 System.setProperty("webdriver.edge.driver", driverPath+"MicrosoftWebDriver.exe");
			 driver = new EdgeDriver();			 
	     break;
	     default: 
	    	 System.out.println("Unrecognized browser. Defaulting to Chrome.");
	    	 System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	    	 driver = new ChromeDriver();
		 }
		 
		//Open the requested page
		driver.get(url);
		//Maximize the window to bring the full ESPN menu to view
		driver.manage().window().maximize();
		 
		 return driver;
	 }
	
	 public static WebDriver getDriver() {
		 //Call this to return the driver.
		 return driver;
	 }
	 
	 public static void cleanup() {
		 //Call this to close the browser window
		 driver.quit();
	 }
}