package espn.Framework.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import espn.Framework.Setup.espnWebSetup;

public class espnMenuBarActions {
	
	//Get the WebDriver from espnWebSetup
	static WebDriver driver = espnWebSetup.getDriver();
	
	//Create an object to access the variables in espnMenuBarElements
	static espnMenuBarElements nfl = new espnMenuBarElements();
	static espnMenuBarElements mlb = new espnMenuBarElements();
	
			
	public static void clickNFL() {
		//Using the nfl object, find the NFL option on the menu bar and click it.
		By element = By.xpath(nfl.nflMenu);
		custom.waitFor(element);
		driver.findElement(By.xpath(nfl.nflMenu)).click();
	}
	
	public static void clickNFLStats() {
		//Using the nfl object, find the Stats option on the NFL menu bar and click it.
		By element = By.xpath(nfl.nflMenuStats);
		custom.waitFor(element);
		driver.findElement(By.xpath(nfl.nflMenuStats)).click();
	}
	
	public static void clickMLB() {
		//Using the mlb object, find the MLB option on the menu bar.0
		//ESPN goes back and forth between hover and click to display the menu for some odd reason
		//First check to see if we can hover and display the menu by looking for the next object we want to click.
		//If the object is visible, hover worked. If not, click the menu to display it.
		By element = By.xpath(mlb.mlbMenu);
		boolean statsDisplayed = false;
		
		custom.waitFor(element);
		
		//Custom code to hover and set the boolean true or false
		custom.hover(element);
		statsDisplayed = driver.findElement(By.xpath(mlb.mlbMenuStats)).isDisplayed();
			
		//If the boolean is false, click the menu. Otherwise, do nothing.
		if (statsDisplayed  != true) {
			driver.findElement(By.xpath(mlb.mlbMenu)).click();
		}
	}
	
	public static void clickMLBStats() {
		//Using the mlb object, find the Stats option on the MLB menu bar and click it.
		By element = By.xpath(mlb.mlbMenuStats);
		custom.waitFor(element);
		driver.findElement(By.xpath(mlb.mlbMenuStats)).click();
	}
	
	
	
}
