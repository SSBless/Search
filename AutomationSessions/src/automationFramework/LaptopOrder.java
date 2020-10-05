package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
    driver.get("http://tutorialsninja.com/demo/");
    driver.manage().window().maximize();
    driver.findElement(By.name("search")).sendKeys("laptop");
    //driver.findElement(By.xpath("//div[@id='search']/child::span")).click();
    driver.findElement(By.xpath("//input[@name='search']/following::button[1]")).click();
    
	}

}
