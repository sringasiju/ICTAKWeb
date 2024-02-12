/**
 * 
 */
package org.ictkerala.ictakwebsite;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;





/**
 * @author Sringa
 *
 */
public class DriverClass {
	WebDriver driver;
	
	
	@BeforeClass
	
	
	public void init() 
	{
		
		
		
			driver = new ChromeDriver();
		
		
		
	driver.get("http://64.227.132.109/LandingPage");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		

}
	@AfterClass
	public void End()
	{
		System.out.println("All Test Caeses are Executed");
	}
}
