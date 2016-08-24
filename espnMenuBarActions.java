package espn.Framework.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import espn.Framework.Objects.espnMenuBarElements;
import espn.Framework.Setup.espnWebSetup;

public class espnMenuBarActions {

	//Get the WebDriver from espnWebSetup
	static WebDriver driver = espnWebSetup.getDriver();
	//Create an object to access the variables in espnMenuBarElements
	static espnMenuBarElements nfl = new espnMenuBarElements();
	static espnMenuBarElements mlb = new espnMenuBarElements();
			
	public static void clickNFL() {
		//Using the nfl object, find the NFL option on the menu bar and click it.
		driver.findElement(By.xpath(nfl.nflMenu)).click();
	}
	
	public static void clickNFLStats() {
		//Using the nfl object, find the Stats option on the NFL menu bar and click it.
		driver.findElement(By.xpath(nfl.nflMenuStats)).click();
	}
	
	public static void clickMLB() {
		//Using the nfl object, find the NFL option on the menu bar and click it.
		driver.findElement(By.xpath(mlb.mlbMenu)).click();
	}
	
	public static void clickMLBStats() {
		//Using the nfl object, find the Stats option on the NFL menu bar and click it.
		driver.findElement(By.xpath(nfl.mlbMenuStats)).click();
	}
	
	
	
}
