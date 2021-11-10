package Baseclasspkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassexample {
public static WebDriver driver;	
public static FileInputStream fp;
public static Properties prop1;

public  Baseclassexample() throws FileNotFoundException, IOException{
	prop1=new Properties();	
	prop1.load(new FileInputStream(new File("F:\\workspace\\pageobjectexample\\src\\test\\java\\propertyfilesexample\\config.properties")));

	
	
	
/*static{
	prop1=new Properties();
	try {
		prop1.load(new FileInputStream(new File("F:\\workspace\\pageobjectexample\\src\\test\\java\\propertyfilesexample\\config.properties")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
}


@BeforeSuite
public void openBrowser() throws FileNotFoundException, IOException{
	Baseclassexample bs=new Baseclassexample();
	
	if(prop1.get("Browser").equals("Chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(prop1.get("Browser").equals("Firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		
	}
	
	
	driver.get(prop1.getProperty("URL"));
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterSuite
public void closeBrowser(){
	driver.quit();

}
}
