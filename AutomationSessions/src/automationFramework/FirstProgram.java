package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		//Driver prefernce & Driver location given in Set property 
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	// To open the driver
	// Need to import chrome & Web driver properties from selenium jars
	WebDriver driver=new ChromeDriver();
	// get method for hitting URL
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	//find the id user name,password and type the value thru keyboards
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//click the login button
	driver.findElement(By.id("login-button")).click();
	driver.close();
	

	}

}
