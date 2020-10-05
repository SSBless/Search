
package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressBook {

    	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://a.testaddressbook.com/sign_up");
	driver.findElement(By.id("user_email")).sendKeys("august20@gmail");
	driver.findElement(By.id("user_password")).sendKeys("Password123$");
	driver.findElement(By.name("commit")).click();
	
	
			
			
			
			
			
			

	}

}
