package Process;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import Utility.Helper;

public class LoginProcess extends Helper {

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	LoginPage lp = new LoginPage(driver);
	
	public void ValidCredentialLoginDetails()
	{
		lp.UserName().clear();
		lp.UserName().sendKeys("abc@gmail.com");
		lp.Password().clear();
		lp.Password().sendKeys("123434543");
		lp.SignInButton().click();
		
	}
	
	public void InValidCredentialLoginDetails()
	{
		lp.UserName().clear();
		lp.UserName().sendKeys("abcdd@gmail.com");
		lp.Password().clear();
		lp.Password().sendKeys("12ddd3434543");
		lp.SignInButton().click();
		
	}

}
