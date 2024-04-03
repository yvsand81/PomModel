package RegressionSuite;

import org.testng.annotations.Test;

import Process.LoginProcess;

public class LoginTest extends SetUp {
	
	LoginProcess lp ;
	
	@Test(priority=1)
	public void LoginWithCorrectCredentials()
	{
		lp= new LoginProcess(driver);
		lp.ValidCredentialLoginDetails();
				
	
	}
	
	@Test(priority=2)
	public void LoginWithInvalidCredential()
	{
		lp.InValidCredentialLoginDetails();
	}

}
