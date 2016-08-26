package espn.Framework.Tests;

import espn.Framework.Objects.espnMenuBarActions;
import espn.Framework.Setup.espnWebSetup;

public class espnNFLTest {

	public static void main(String[] args) {
		
		//Test to click the NFL menu on ESPN.com and then click the Stats menu option
		espnWebSetup.setupDriver("chrome", "http://espn.com");
		espnMenuBarActions.clickNFL();
		espnMenuBarActions.clickNFLStats();

	}

}
