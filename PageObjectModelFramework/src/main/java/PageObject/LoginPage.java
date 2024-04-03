package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Helper;

public class LoginPage extends Helper {
	
	public WebElement element ;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement UserName()
	{
		return element = getElementName("email");
	}
	
	public WebElement Password()
	{
		return element = getElementID("pass");
	}
	
	public WebElement SignInButton()
	{
		return element = getElementXpath("//button[@name='login']");
	}
	
	

}
