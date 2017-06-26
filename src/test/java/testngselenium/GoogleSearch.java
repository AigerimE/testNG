package testngselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test
  public void search() {
		System.out.println("Google searching . . .");
  }
	
	@Test
	@Parameters({"UserName", "Password"})
	public void loginToGmailAccount(String userName, String password){
		System.out.println("Login to account using: " + userName + " and " + password);
	}
	
	
}
