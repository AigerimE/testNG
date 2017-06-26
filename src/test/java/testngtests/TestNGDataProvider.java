package testngtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider = "credentials")
  public void login(String userName, String password) {
		System.out.println("Loggin in using : " + userName + " and " + password);
  }
	
	@DataProvider(name = "credentials")
	public Object[][] testData(){
		String [] [] credentials = new String [2] [2];
		credentials[0][0] = "userName1";
		credentials[0][1] = "pwd1";
		credentials[1][0] = "userName2";
		credentials[1][1] = "pwd2";
		
		return credentials;
	}
}
