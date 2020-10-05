package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Laptoporder2 {
	WebDriver driver;
	@Test
	public void a_laptop()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Essential\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	}
	@Test 
	public void b_search() {
		driver.findElement(By.name("search")).sendKeys("laptop");
	    //driver.findElement(By.xpath("//div[@id='search']/child::span")).click();
	    driver.findElement(By.xpath("//input[@name='search']/following::button[1]")).click();
	    
	}

}
