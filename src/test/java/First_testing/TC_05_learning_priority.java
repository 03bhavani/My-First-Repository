package First_testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_05_learning_priority {



	@BeforeClass
	public void launch_application() {

		System.out.println("I am launching the applicaiton");
	}


	@Test(priority=2)
	public void home_page_validation() {
		System.out.println("Testing home page");

	}
	@Test(priority=1)
	public void signin_page_validation() {
		System.out.println("Testing Sign in page");
	}

	@Test(priority=0)
	public void signup_page_validation() {
		System.out.println("Testing Sign up page");

	}

	@Test(priority=3)
	public void cart_page_validateion() {
		System.out.println("Testing cart page");

	}

	@AfterClass
	public void  close_application() {
		System.out.println("I am closing googlechrome");

		}

}
