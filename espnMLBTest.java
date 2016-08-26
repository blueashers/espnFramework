package espn.Framework.Tests;

import espn.Framework.Objects.espnMLBStatsPage;
import espn.Framework.Objects.espnMenuBarActions;
import espn.Framework.Setup.espnWebSetup;

public class espnMLBTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Test to navigate to the MLB stats page an print out HR leaders
		
		//Send browser type and url to setup the webdriver
		espnWebSetup.setupDriver("chrome", "http://espn.com");
		
		//Call to click the MLB menu
		espnMenuBarActions.clickMLB(); 

		//Click the stats option once the menu is displayed
		espnMenuBarActions.clickMLBStats();
		
		//Click a link to go to the complete stats page
		espnMLBStatsPage.clickCompleteLeadersHR();
		
		//Click a dropdown to select the league (AL. NL or MLB)
		espnMLBStatsPage.clickLeagueDropdown();
		
		//Click MLB
		espnMLBStatsPage.clickLeagueMLB();

		//Method to read the player names and HR totals and print them to the console.
		espnMLBStatsPage.listLeaders();
		
		//Close the browser
		espnWebSetup.cleanup();

	}

}
