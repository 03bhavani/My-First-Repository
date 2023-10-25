package First_testing;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_04_childsupport {

	WebDriver driver;

	@BeforeClass

	@Parameters({"url","email"}) 
	public void launch_application(String url, String email) {

		System.out.println(email);
		driver=new ChromeDriver(); // this line is creating Chrome driver instance and storing  it into driver variable

		// Give url into the browser

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void close_the_application() {

		System.out.println("I am closing googlechrome");

		driver.quit();
	}



	//@Test
	public void test_contactus_testing() {

		//Navigate to contact us page.
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to get online case information. ']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to calculate child support.']")).isDisplayed());	
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to make a payment.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to apply for services.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to access frequently asked questions.']")).isDisplayed());

	}

    @Test

	@Parameters({"url","title"}) 
	public void test_homepage(String url, String title) {
         driver.navigate().to(url);  
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Runtime_Title=driver.getTitle();
		Assert.assertEquals(title,Runtime_Title);
		
		//validate contact us page
		test_contactus_testing();
		

	}







}
