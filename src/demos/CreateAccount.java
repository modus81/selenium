package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CreateAccount {

	public static void main(String[] args) {
		
		
		// 1. Create WebDriver
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// 2. Navigate to Account management Page >> Click on Create Account
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		// 3. Fill out the form
		
		// 4. Get confirmation
		
		// 5. Close browser
		
		
		
	}

}
