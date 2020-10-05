package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddressBooktesteng {

	WebDriver driver;
 @Test 
 public void a_pageload() {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		driver.manage().window().maximize();
		 }
 @Test
 public void b_signup() {
	 driver.findElement(By.id("user_email")).sendKeys("sept21@gmail.com");
	 driver.findElement(By.id("user_password")).sendKeys("123sept$");
	 driver.findElement(By.name("commit")).click();
 }
}

