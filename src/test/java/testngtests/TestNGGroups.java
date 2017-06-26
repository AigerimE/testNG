package testngtests;

import org.testng.annotations.Test;

public class TestNGGroups {
  
	@Test(groups = {"fruits"})
  public void apples() {
	  System.out.println("Apples");
  }
  
  @Test(groups = {"fruits"})
  public void grapes() {
	  System.out.println("Grapes");
  }
  
  @Test(groups = {"fruits"})
  public void oranges() {
	  System.out.println("Oranges");
  }
  
  @Test(groups = {"fruits"})
  public void cucumbers() {
	  System.out.println("Cucumber");
  }
  
  @Test(groups = {"pets"})
  public void cats() {
	  System.out.println("Cats");
  }
  
  @Test(groups = {"pets"})
  public void dogs() {
	  System.out.println("Dogs");
  }
  
  @Test(groups = {"pets"})
  public void fish() {
	  System.out.println("Fish");
  }
  
}
