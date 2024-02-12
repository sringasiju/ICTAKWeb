package org.ictakerala.ictakwebsite;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//TC#6

public class AdminLogin {
	WebDriver driver;
	
	
	@FindBy(xpath="//a[@data-bs-toggle='modal']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@name=\"email\" and @placeholder='Enter Your Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name=\"password\" and @type='password']")
	private WebElement Password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SignIn;
	
	@FindBy(xpath="//h2[@id='swal2-title' and text()='Warning!!']")
	private WebElement Warning_Message;
	@FindBy(xpath="//button[@type='button' and @class='swal2-confirm swal2-styled']")
	private WebElement WarningOk;
	@FindBy(xpath="//div[@id='swal2-html-container' and text()='Invalid!']")
	private WebElement Password_Inavlid;
	@FindBy(xpath="//button[@type='button' and @class='swal2-confirm swal2-styled']")
	private WebElement Password_Inavlid_Ok;
	@FindBy(xpath="//small[text()='Email is required']")
	private WebElement Email_Required;
	
	
	@FindBy(xpath="//h4[@class=\"font-weight-bolder mb-0\" and text()='Dashboard']")
	private WebElement Dashboard;
	@FindBy(xpath="//a[@routerlink=\"/adminpage/partnership\"]")
	private WebElement AdminPartnership;
	@FindBy(xpath="//h4[text()='Partnership Application']")
	private WebElement Partnership_Application;
	@FindBy(xpath="//button[@class='btn bg-gradient-primary btn-sm mb-0']")
	private WebElement Download;
	
	@FindBy(xpath="//a[@role='button' and @aria-controls='ProfileNav']")
	private WebElement Admin_button;
	@FindBy(xpath="//*[@id=\"ProfileNav\"]/ul/li/a")
	private WebElement Logout;
	
public AdminLogin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

//TC#6_11
public void setLogin()
{
	Login.click();
	}
//TC#6.1_11
public void setinvalidCase1(String email1,String password1)
{
	Email.sendKeys(email1);
	Password.sendKeys(password1);
	SignIn.click();
	System.out.println("Login Failed with invalid Email");
	}

//TC#6.2_12
public void setinvalidCase2(String email2,String password2)
{
	Email.clear();
	Email.sendKeys(email2);
	Password.clear();
	Password.sendKeys(password2);
	SignIn.click();
	}

public boolean Assertion_Warning()
{
	return Warning_Message.getText().contains("Warning!!");
	}
public void warning_button()
{
	WarningOk.click();
	System.out.println("Login Failed with invalid Password");
	}

//TC#6.3_13
public void setinvalidCase3(String email3,String password3)
{
	Login.click();
	Email.clear();
	Email.sendKeys(email3);
	Password.clear();
	Password.sendKeys(password3);
	SignIn.click();
	}

public boolean Assertion_password()
{
	return Password_Inavlid.getText().contains("Invalid!");
}
public void Invalid_button()
{
	Password_Inavlid_Ok.click();
	System.out.println("Login Failed without password");
	}

//TC#6.4_14
public void setinvalidCase4(String email4,String password4)
{
	Login.click();
	Email.clear();
	Email.sendKeys(email4);
	Password.clear();
	Password.sendKeys(password4);
	SignIn.click();
	System.out.println("Login Failed without Email");
	driver.navigate().refresh();
	}


//TC#6_10
public void setvalidemail(String email)
{
	Login.click();
	Email.clear();
	Email.sendKeys(email);
	}
	
public void setvalidpassword(String password)
{
	Password.clear();
	Password.sendKeys(password);
	}

//TC#6_15
public void setsubmit()
{
	SignIn.click();
	System.out.println("Login Successfull with valid Email and Password");
	}
public boolean isAdmin_Opened()
{
	return Dashboard.getText().toString().contains("Dashboard");
}

//TC#6.1_16
public void setadminpartnership()
{
	AdminPartnership.click();
	}
public boolean isApplication_Opened()
{
	return Partnership_Application.getText().toString().contains("Partnership Application");
}

//TC#6.1_17
public void getDownload()
{
	Download.click();
	}
public void setLogout()
{
	Admin_button.click();
	//actions.moveToElement(Logout).click().build().perform();
	Logout.click();
	}

}		
		
			