package testngtests;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class TestNGPrioritizing {

	@Test(priority=0)
  public void one() {
		System.out.println("One");
		fail();
  }
	@Test(priority=1, dependsOnMethods = {"one"})
	  public void two() {
		System.out.println("Two");
	  }
	@Test(priority=2)
	  public void three() {
		System.out.println("Three");
	  }
	@Test(priority=3, enabled = false)
	  public void four() {
		System.out.println("Four");
	  }
}
