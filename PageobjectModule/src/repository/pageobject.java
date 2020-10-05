package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageobject {
	WebDriver driver;
	
	public pageobject() {
		this.driver=driver;
	}
@FindBy(how=How.CLASS_NAME,using="login") WebElement signlink;
@FindBy(how=How.ID,using="email") WebElement loginfield;
@FindBy(how=How.ID,using="passwd") WebElement pass;
@FindBy(how=How.ID,using="SubmitLogin") WebElement loginbutton;
@FindBy(how=How.CLASS_NAME,using="logout") WebElement signout;

public void signin() {
	signlink.click();
	loginfield.sendKeys("menu7th2019@yopmail.com");
	pass.sendKeys("Passw0rd$123");
	loginbutton.click();
	
}
public void signout() {
	signout.click();
	
}
}
