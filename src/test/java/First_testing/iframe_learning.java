package First_testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iframe_learning {
	
	WebDriver driver;

	@BeforeClass
	public void launch_application() {

		System.out.println("I am launching googlechrome browser");
		driver=new ChromeDriver(); // this line is creating Chrome driver instance and storing  it into driver variable

		// Give url into the browser

		driver.get("https://the-internet.herokuapp.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	
	@Test
	public void iframe_test() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = "An iFrame containing the TinyMCE WYSIWYG Editor";
		
		String Runtime_Title=driver.findElement(By.xpath("//h3")).getText();
		Assert.assertEquals(title,Runtime_Title);
		
       // driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='tox-edit-area']//iframe")));
	//	String alertMessage= driver.switchTo().alert().getText();
	//	System.out.println(alertMessage);
		
	   // driver.findElement(By.xpath("//div[@class='tox-edit-area']//iframe")).clear();
			
	 //  driver.findElement(By.xpath("//div[@class='tox-edit-area']//iframe")).sendKeys("Good morning");
		
		// switch to iframe
		
		driver.switchTo().frame(0);
		//Clear the text
		
		driver.findElement(By.xpath("//p[text()='Your content goes here.']")).clear();
		
		//Enter the text
		 driver.findElement(By.xpath("//p")).sendKeys("Good morning");
		 
		 Thread.sleep(5000);
		 
		// System.out.println(driver.getTitle());
		
		 
		//coming out of frame/switching back to page		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//h3")).isDisplayed();
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 Thread.sleep(5000);
	}
	
	@AfterClass
		public void close_the_application() {

		System.out.println("I am closing googlechrome");
		
		driver.quit();
	}
	
	

}
