package espn.Framework.Tests;

import espn.Framework.Objects.espnMLBStatsPage;
import espn.Framework.Objects.espnMenuBarActions;
import espn.Framework.Setup.espnWebSetup;

public class espnMLBTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Test to click the NFL menu on ESPN.com and then click the Stats menu option
		espnWebSetup.setupDriver("chrome", "http://espn.com");
		espnMenuBarActions.clickMLB();
		
		Thread.sleep(2000);
		
		espnMenuBarActions.clickMLBStats();
		
		Thread.sleep(2000);
		
		espnMLBStatsPage.clickCompleteLeadersHR();
		
		Thread.sleep(2000);
		
		espnMLBStatsPage.clickLeagueDropdown();
		
		Thread.sleep(2000);
		
		espnMLBStatsPage.clickLeagueMLB();
		
		Thread.sleep(2000);
		
		espnMLBStatsPage.listLeaders();
		
		espnWebSetup.cleanup();

	}

}
