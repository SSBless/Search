package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import repository.pageobject;

public class script {
	WebDriver driver;
	
	@Test
	public void a_pageload() { 
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Essential\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	@Test
	public void b_signinout() {
		pageobject paobj = PageFactory.initElements(driver, pageobject.class);
		paobj.signin();
		paobj.signout();
	}

}
