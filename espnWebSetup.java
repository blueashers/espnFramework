package espn.Framework.Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
			 System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
			 driver = new FirefoxDriver();
	     break;
	     default: 
	    	 System.out.println("Unrecognized browser. Defaulting to Chrome.");
	    	 System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	    	 driver = new ChromeDriver();
		 }
		 
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Open the requested page
		driver.get(url);
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