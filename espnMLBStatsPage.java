package espn.Framework.Objects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import espn.Framework.Setup.espnWebSetup;

public class espnMLBStatsPage {
	//Retrieve the WebDriver
	static WebDriver driver = espnWebSetup.getDriver();
	
	//Set xpaths to access elements
	static String hrLeadersxpath = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div[1]/div[5]/div/div/table/tbody/tr[7]/td/a";
	static String leagueDropdownxpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/form[1]/select";
	static String mlbLeagueSelectionxpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/form[1]/select/option[3]";
	
	//Set xpaths for use when retrieving a list
	static String listNamexpath = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/table/tbody/tr[*]/td[2]/a";
	static String listHRSxpath = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/table/tbody/tr[*]/td[9]";

	//Method to click the Complete Leaders link on the MLB Stats page
	public static void clickCompleteLeadersHR() {
		By element = By.xpath(hrLeadersxpath);
		custom.waitFor(element);
		driver.findElement(By.xpath(hrLeadersxpath)).click();
	}
	
	//Method to click the League dropdown on the Batting stats page
	public static void clickLeagueDropdown() {
		By element = By.xpath(leagueDropdownxpath);
		custom.waitFor(element);
		driver.findElement(By.xpath(leagueDropdownxpath)).click();
	}
	
	//Method to click MLB in the League dropdown on the Batting stats page
	public static void clickLeagueMLB() {
		By element = By.xpath(mlbLeagueSelectionxpath);
		custom.waitFor(element);
		driver.findElement(By.xpath(mlbLeagueSelectionxpath)).click();
	}
	
	//Method to select and list all MLB homerun leaders on the page
	public static void listLeaders() {
		//Get a list for the names and HRS on the page
		List<WebElement> listNames = driver.findElements(By.xpath(listNamexpath));
		List<WebElement> listHRS = driver.findElements(By.xpath(listHRSxpath));
		
		By element = By.xpath(listNamexpath);
		custom.waitFor(element);
		
		//Iterate through listHRS list because it grabs "HR" from the table
		//Remove each instance of "HR"
		//Doing this will resize the List for the next for loop
		for (int count=0; count<listHRS.size(); count++) {
			if (listHRS.get(count).getText().equals("HR")) {
				listHRS.remove(count);
			}
		}

		//Iterate through the lists and print the names of the HR Leaders and their # of Homeruns.
		for (int i = 0; i<listHRS.size(); i++) {
			System.out.println(listNames.get(i).getText() + "  " + listHRS.get(i).getText());
		}
	}
	
}
