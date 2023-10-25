package First_testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_05_learning_groups {



	@BeforeSuite
	public void launch_application() {

		System.out.println("I am launching the applicaiton");
	}


	@Test(groups= {"e2e"})
	public void home_page_validation() {
		System.out.println("Testing home page");

	}
	@Test(groups= {"Regression"})
	public void signin_page_validation() {
		System.out.println("Testing Sign in page");
	}

	@Test(groups= {"Regression"})
	public void signup_page_validation() {
		System.out.println("Testing Sign up page");

	}

	@Test(groups= {"Smoke"})
	public void cart_page_validateion() {
		System.out.println("Testing cart page");

	}

	@AfterSuite
	public void  close_application() {
		System.out.println("I am closing googlechrome");

		}

}
