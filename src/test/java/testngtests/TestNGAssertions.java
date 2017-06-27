package testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
  @Test
  public void assertionTest() {
	  System.out.println("Before hard assertion");
	  Assert.assertEquals(10, 10);
	  System.out.println("After hard assertion");
	  System.out.println("yeah do your thing");
  }
  
  @Test
  public void assertionTestSoft(){
	  System.out.println("Before soft assertion");
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(10, 20);
	  System.out.println("After soft assertion");
	 sa.assertAll(); 
  }
  
  
}
