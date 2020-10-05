package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digitalbank {

    	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://dbankdemo.com/login");
	    driver.findElement(By.id("username")).sendKeys("abccba");
	    driver.findElement(By.id("password")).sendKeys("password123$");
	    driver.findElement(By.id("submit")).click();

	}
}