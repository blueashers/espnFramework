package espn.Framework.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import espn.Framework.Setup.espnWebSetup;

//This class will hold custom code to attempt to shorten calls
public class custom {
	static WebDriver driver = espnWebSetup.getDriver();
	
	public static void hover(By element) {
		/*This method sets up a hover. To use:
		 * Create an element using "By" - example:
		 * 
		 * 		By element = By.xpath(xpathPath);
		 * 
		 * Once the element is set, call custom.hover and pass the element:
		 * 
		 * 		custom.hover(element);
		 * 
		 */
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(element)).perform();
		
	}
	
	public static void waitFor(By element) {
		/*This method creates a custom explicit way. To use:
		 * Create an element using "By" - example:
		 * 
		 * 		By element = By.xpath(xpathPath);
		 * 
		 * Once the element is set, call custom.waitFor and pass the element:
		 * 
		 * 		custom.waitFor(element);
		 * 
		 */
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
}
