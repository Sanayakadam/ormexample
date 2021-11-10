package pageobjectpoexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPO {
WebDriver driver;

@FindBy(id= "txtUsername")
WebElement txtusername;

@FindBy(id= "txtPassword")
WebElement txtpassword;

@FindBy(id= "btnLogin")
WebElement btnLogin;

public void loginopertion(){
	txtusername.clear();
	txtusername.sendKeys("Admin");
	
	txtpassword.clear();
	txtpassword.sendKeys("admin123");
	
	btnLogin.click();
}

}
