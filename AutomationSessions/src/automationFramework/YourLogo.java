package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("email_create")).sendKeys("abccba6@yopmail.com");
    driver.findElement(By.id("SubmitCreate")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("id_gender2")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("Mango");
    driver.findElement(By.id("customer_lastname")).sendKeys("Apple"); 
    driver.findElement(By.id("passwd")).sendKeys("asdfghJ1!");
    Select date=new Select(driver.findElement(By.id("days")));
    //select class used to select dropdown list from the web screen eg.DAy,month,year
    date.selectByVisibleText("20  ");
    //select by actual value
    Select month=new Select(driver.findElement(By.id("months")));
    month.selectByVisibleText("August ");
    Select year=new Select(driver.findElement(By.id("years")));
    year.selectByVisibleText("2004  ");
    driver.findElement(By.id("newsletter")).click();
    driver.findElement(By.id("firstname")).sendKeys("Mango");
    driver.findElement(By.id("lastname")).sendKeys("Apple");
    driver.findElement(By.id("address1")).sendKeys("abc street P.O.BOX1");
    driver.findElement(By.id("city")).sendKeys("California");
    Select state=new Select(driver.findElement(By.id("id_state")));
    state.selectByVisibleText("California");
    driver.findElement(By.id("postcode")).sendKeys("54321");
    driver.findElement(By.id("phone_mobile")).sendKeys("7234567897");
    driver.findElement(By.id("submitAccount")).click();  
       
	}

}
