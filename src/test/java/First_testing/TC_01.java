package First_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01 {
// doing some changes.

	WebDriver driver;

	@BeforeClass
	public void launch_application() {

		System.out.println("I am launching googlechrome browser");
		driver=new ChromeDriver(); // this line is creating Chrome driver instance and storing  it into driver variable

		// Give url into the browser

		driver.get("https://www.google.com");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void close_the_application() {

		System.out.println("I am closing googlechrome");
		
		driver.quit();
	}
	





	@Test
	public void do_testing() {
		//System.out.println("My first TestNG Test Script");
		//if(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed()) {
			//System.out.println("Google logo is present");
		//}
	Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed());
	
		
	}


	@Test
	public void do_testing_1() {
		System.out.println("My second TestNG Test Script");
	}











}
