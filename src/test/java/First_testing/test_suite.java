package First_testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class test_suite {
	
	@BeforeSuite
	public void launch_application() {

		System.out.println("I am launching the applicaiton");
	}

	
	@AfterSuite
	public void  close_application() {
		System.out.println("I am closing googlechrome");

		}

}
