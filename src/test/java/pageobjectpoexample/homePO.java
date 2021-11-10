package pageobjectpoexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class homePO {

	
	@FindBy(xpath="//*[text()='Admin']")
	WebElement txtadmin;
	
	@FindBy(xpath="//*[text()='User Management']")
	WebElement txtusermanagement;
	
	@FindBy(xpath="//*[text()='Users']")
	WebElement txtuser;
	
	public void clickusers(WebDriver driver){
		Actions a=new Actions(driver);
		a.moveToElement(txtadmin).build().perform();
		a.moveToElement( txtusermanagement).build().perform();
		a.moveToElement(txtuser).build().perform();
	}
}
