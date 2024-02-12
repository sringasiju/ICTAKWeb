package org.ictakerala.ictakwebsite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

//TC#5
public class PartnershipPage {
	WebDriver driver;
	
	@FindBy(xpath="//ul/li[4]//a[@id='dropdownMenuDocs']")
	private WebElement membership;
	@FindBy(xpath= "//ul/li[3]//a[@href='/LandingPage/partnership']")
	private WebElement partnership;
	
	@FindBy(xpath= "//h1[@data-aos='flip-up' and @class='text-light aos-init aos-animate']")
	private WebElement Assertion_partnership;
	
	@FindBy(xpath= "//button[@type='submit' and @routerlink='/LandingPage/partnershipform']")
	private WebElement Register;
	
	@FindBy(xpath= "//h3[text()='PARTNERSHIP FORM']")
	private WebElement Assertion_partnership_Form;
	
	@FindBy(xpath= "//input[@name='name' and @placeholder='Name']")
	private WebElement FullName;
	
	@FindBy(xpath= "//input[@name='email' and @placeholder=' Email']")
	private WebElement Email;
	
	@FindBy(xpath= "//input[@name='phone' and @placeholder=' Contact Number']")
	private WebElement PhoneNumber;
	
	@FindBy(xpath= "//input[@name='firm' and @placeholder='Published Date']")
	private WebElement Firm;
	
	@FindBy(xpath= "//input[@name='address' and @placeholder='Address']")
	private WebElement Address;
	
	@FindBy(xpath= "//input[@name='district' and @placeholder='Distict']")
	private WebElement District;
	
	@FindBy(xpath= "//input[@name='officeSpace' and @placeholder=' Office Space in Square Feet']")
	private WebElement OfficeSpace;
	
	@FindBy(xpath= "//input[@name='employeeCount' and @placeholder='Number of Employees']")
	private WebElement EmployeeCount;
	
	@FindBy(xpath= "//textarea[@name='report']")
	private WebElement BriefReport;
	
	@FindBy(xpath= "//textarea[@name='expect']")
	private WebElement Expects;
	
	@FindBy(xpath= "//textarea[@name='profile']")
	private WebElement Promoters;
	
	
	@FindBy(xpath= "//button[@type='submit' and @class='btn bg-gradient-primary mt-3 mb-0']")
	private WebElement SendMessage;
	@FindBy(xpath= "//button[@type='submit' and @class='btn bg-gradient-primary mt-3 mb-0']")
	private WebElement SendMessage1;
	public PartnershipPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//TC#4.1_2
	public void setmembership()
	{
		membership.click();
	}
	
	//TC#4.1_3
	public void setpartnership()
	{
		
		partnership.click();
	}
	
	//TC#5_4
	public boolean isPartnershipOpened()
	{
		return Assertion_partnership.getText().toString().contains("PARTNERSHIP");
	}
	
	//TC#5_5
	public void setregister()
	{
		Register.click();
	}
	
	//TC#5_6
	public boolean isFormAvailable()
	{
		return Assertion_partnership_Form.getText().toString().contains("PARTNERSHIP FORM");
	}
	
	//TC#5_8
	//Invalid Test case
	public void setfullname1(String fname1)
	{
		FullName.sendKeys(fname1);
	}
	public void setemail1(String email1)
	{
		Email.sendKeys(email1);
	}
	public void setphonenumber1(String phone1)
	{
	PhoneNumber.sendKeys(phone1);
	}
	public void setfirm1(String date1)
	{
		Firm.sendKeys(date1);
	}
	public void setaddress1(String address1)
	{
		Address.sendKeys(address1);
	}
	public void setdistrict1(String district1)
	{
		District.sendKeys(district1);
	}
	public void setofficespace1(String space1)
	{
		OfficeSpace.sendKeys(space1);
	}
	public void setemployeecount1(String employee1)
	{
		EmployeeCount.sendKeys(employee1);
	}
	public void setbriefreport1(String report1)
	{
		BriefReport.sendKeys(report1);
	}
	public void setexpects1(String expects1)
	{
		Expects.sendKeys(expects1);
	}
	public void setpromoters1(String profile1)
	{
		Promoters.sendKeys(profile1);
	}
	
	public void setform1()
	{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", SendMessage);
		driver.switchTo().alert().accept();
		System.out.println("Test Case Failed:User should get Registration failed message");
	}
	
	//TC#5_6 valid Test Case
	
	public void setfullname(String fname)
	{
		FullName.sendKeys(fname);
	}
	public void setemail(String email)
	{
		Email.sendKeys(email);
	}
	public void setphonenumber(String phone)
	{
	PhoneNumber.sendKeys(phone);
	}
	public void setfirm(String date)
	{
		Firm.sendKeys(date);
	}
	public void setaddress(String address)
	{
		Address.sendKeys(address);
	}
	public void setdistrict(String district)
	{
		District.sendKeys(district);
	}
	public void setofficespace(String space)
	{
		OfficeSpace.sendKeys(space);
	}
	public void setemployeecount(String employee)
	{
		EmployeeCount.sendKeys(employee);
	}
	public void setbriefreport(String report)
	{
		BriefReport.sendKeys(report);
	}
	public void setexpects(String expects)
	{
		Expects.sendKeys(expects);
	}
	public void setpromoters(String profile)
	{
		Promoters.sendKeys(profile);
	}
	
	//TC#5_7
	
	public void setform()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", SendMessage);
		//driver.switchTo().alert().accept();
		//System.out.println("Registratoin Successfull");
	}
		
}
