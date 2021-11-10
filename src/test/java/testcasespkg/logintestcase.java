package testcasespkg;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Baseclasspkg.Baseclassexample;
import pageobjectpoexample.loginPO;

public class logintestcase extends  Baseclassexample {

	
	public logintestcase() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@Test
	public void Login(){
	loginPO lp= PageFactory.initElements(driver, loginPO.class);
	lp.loginopertion();
	}
	
}
