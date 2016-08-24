package espn.Framework.Objects;
import org.openqa.selenium.WebDriver;

import espn.Framework.Setup.espnWebSetup;

public class espnMenuBarElements {

	static WebDriver driver = espnWebSetup.getDriver();
	
	static String nflMenu = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[1]/a/span/span[1]";
	static String nbaMenu = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[2]/a/span/span[1]";
	static String mlbMenu = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[3]/a/span/span[1]";
	static String ncaafMenu = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[4]/a/span/span[1]";
	static String soccerMenu = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[5]/a/span/span[1]";
	
	
	//xpaths for submenu options
	//NFL
	static String nflMenuHome = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[1]/div/ul[1]/li[1]/a/span/span[1]";
	static String nflMenuStats = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[1]/div/ul[1]/li[6]/a/span/span[1]";
	
	//MLB
	static String mlbMenuHome = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[3]/div/ul[1]/li[1]/a/span/span[1]";
	static String mlbMenuStats = "/html/body/div[6]/div[2]/header/nav[1]/ul/li[3]/div/ul[1]/li[5]/a/span/span[1]";
	
}
