/**
 * 
 */
package org.ictakerala.ictakwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Sringa
 *
 */
//TC#4
public class Homepage {
	WebDriver driver;
	//TC#4.1
	private By home = By.xpath("//h1[text()='ICT Academy of Kerala']");
	//private By membership = By.xpath("//ul/li[4]//a[@id='dropdownMenuDocs']");
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public String getTextHome()
	{
		return driver.findElement(home).getText();
		
		}
	
	
}
