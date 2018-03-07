package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Test plan
 1. Open the webpage
 2. Navigate to the application
 3. Enter email address
 4. Enter password
 5. Click login
 6. Get confirmation
 7. Close browser
 */
public class Login {
	
	public static void main(String[] args){
 
	//1. Create WebDriver
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    //2. Open web browser
    driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	
    //Find elements: Locate the element determine the action, pass any parameters
    
    //3. Enter email address	
	driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("tim@testemail.com");
	
	//4. Enter Password 
	driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");	
	
	//5. Click Login
	driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
	
	//6. Get confirmation; Use dialog shown after logging in successfully to confirm and page titile
	String message =driver.findElement(By.id("conf_message")).getText();
	 System.out.println("Confirmation" + message);
		
	
	String pageTitle = driver.getTitle();
	if (pageTitle.equals("SDET Training | Account Management") ){
		System.out.println("Page Title Passed");
	}
	
	//7. Close browser
	driver.close();
	
	}
}