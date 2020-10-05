package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Modeltest {

	WebDriver driver;
	@Test
	public void a_Modeltest() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
			}
	@Test
	public void b_search() {
		driver.findElement(By.name("q")).sendKeys("selenium jobs in canada");
		driver.findElement(By.name("q")).click();
	}
	
}

