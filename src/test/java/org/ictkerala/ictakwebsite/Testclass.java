/**
 * 
 */
package org.ictkerala.ictakwebsite;

import java.time.Duration;

import org.ictakerala.ictakwebsite.AdminLogin;
import org.ictakerala.ictakwebsite.Homepage;
import org.ictakerala.ictakwebsite.PartnershipPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sringa
 *
 */
public class Testclass extends DriverClass {
	Homepage homeobj;
	PartnershipPage partneshipobj;
	AdminLogin adminobj;
	@Test(priority=1)
	public void homepage()
	{
		homeobj=new Homepage(driver);
		
		String text = homeobj.getTextHome();
		Assert.assertEquals(text,"ICT Academy of Kerala");
		System.out.println("Home page loaded successfully");
	}
	@Test(priority=2)
	public void partnershippage()
	{
		partneshipobj=new PartnershipPage(driver);
		
		partneshipobj.setmembership();
		
		partneshipobj.setpartnership();
		Assert.assertTrue(partneshipobj.isPartnershipOpened());
		partneshipobj.setregister();
		Assert.assertTrue(partneshipobj.isFormAvailable());
		partneshipobj.setfullname("siju");
		partneshipobj.setemail("sijukk09@gmail.com");
		
		partneshipobj.setphonenumber1("");
		partneshipobj.setfirm1("");
		partneshipobj.setaddress1("");
		partneshipobj.setdistrict1("");
		partneshipobj.setofficespace1("");
		partneshipobj.setemployeecount1("");
		partneshipobj.setbriefreport1("");
		partneshipobj.setexpects1("");
		partneshipobj.setpromoters1("");
		partneshipobj.setform1();
		
		
		//TC#5_9
		//partneshipobj.setemail("xyz1");
		partneshipobj.setphonenumber("9995086349");
		partneshipobj.setfirm("05/08/2022");
		partneshipobj.setaddress("No-22, 2nd Floor, Rubber board, Agartala, Tripura");
		partneshipobj.setdistrict("Agartala");
		partneshipobj.setofficespace("3000 Square feet");
		partneshipobj.setemployeecount("50");
		partneshipobj.setbriefreport("Increased productivity, Attraction of top talent, high level of staff retention");
		partneshipobj.setexpects("Improves Learning Outcomes, Motivates Participants, Enhances Communication, Saves Time and Money");
		partneshipobj.setpromoters("promoter is trusted with carrying out several duties: Identification of Business Opportunity, Detail Investigation, Appointment of Professionals, Preparing Important Documents");
		partneshipobj.setform();
		Alert alert=driver.switchTo().alert();
		String alert_message=alert.getText();
		String expected_message="Registration Successfull";
		Assert.assertEquals(alert_message, expected_message);
		System.out.println(alert_message);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		alert.accept();
		
	}
	@Test(priority=3)
	public void adminpage() 
	{
		adminobj=new AdminLogin(driver);
		adminobj.setLogin();
		
		
		adminobj.setinvalidCase1("Superadmin", "12345");
		
		
		adminobj.setinvalidCase2("superadmin","abc123");
		
		Assert.assertTrue(adminobj.Assertion_Warning());
		adminobj.warning_button();
		
		
		adminobj.setinvalidCase3("superadmin"," ");
		
		Assert.assertTrue(adminobj.Assertion_password());
		adminobj.Invalid_button();
		
		
		adminobj.setinvalidCase4(" ","12345");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		adminobj.setvalidemail("superadmin");
		adminobj.setvalidpassword("12345");
		adminobj.setsubmit();
		
		Assert.assertTrue(adminobj.isAdmin_Opened());
		adminobj.setadminpartnership();
		Assert.assertTrue(adminobj.isApplication_Opened());
		adminobj.getDownload();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		adminobj.setLogout();
		
		
	}
}
