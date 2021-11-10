package testcasespkg;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Baseclasspkg.Baseclassexample;
import pageobjectpoexample.homePO;

public class hometestcase extends Baseclassexample{

	public hometestcase() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@Test
	public void useropertion(){
homePO hp= PageFactory.initElements(driver, homePO.class);
	hp.clickusers(driver);	
	}
}
