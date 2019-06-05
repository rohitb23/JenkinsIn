package edfMAvenRelease;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTestMajor {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.google.com");
	//  System.out.println(driver.getCurrentUrl());
	  Assert.assertEquals("Checking Title","Google", driver.getTitle());
  }
  
  @Test
  public void CheckCal() {
	  
	  System.out.println(4*4*4);
	  
  }
  
  
  @BeforeClass
  public void ChromeSetup() {

		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		/*driver.get("https://www.google.com");
		System.out.println(driver.getTitle());*/
		System.out.println("Driver is up");
		
	  
	  
	  
  }
  
  
  @AfterClass
  public void ClosingInstance() {
	  System.out.println("Closing Drivers");
	  driver.quit();
  }
  
  
}
