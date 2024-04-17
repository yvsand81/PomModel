package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Helper;

public class LoginPage extends Helper {
	public static final String Email = "email";
	public static final String password = "pass";
	public static final String signinButton = "//button[@name='login']";
	
	public WebElement element ;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement UserName()
	{
		return element = getElementName(Email);
	}
	
	public WebElement Password()
	{
		return element = getElementID(password);
	}
	
	public WebElement SignInButton()
	{
		return element = getElementXpath(signinButton);
	}
	
	

}
