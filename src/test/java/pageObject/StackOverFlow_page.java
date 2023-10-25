package pageObject;

import org.openqa.selenium.By;
public class StackOverFlow_page {

	public By stackoverflow_logo(){return By.xpath("//span[text()='Stack Overflow']");}
	public By stackoverflow_search_Box(){return By.xpath("//input[@name='q']");}
	public By stackoverflow_about(){return By.xpath("(//a[text()='About'])[1]");}
	public By stackoverflow_products(){return By.xpath("(//a[contains(.,'Products')])[1]");}
	public By stackoverflow_for_teams(){return By.xpath("//a[text()='For Teams']");}
	public By stackoverflow_login(){return By.xpath("//a[text()='Log in']");}
	public By stackoverflow_signup(){return By.xpath("(//a[text()='Sign up'])[2]");}
	


}
