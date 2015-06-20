package com.homesite.test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest_IE {

//************************************************	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.ie.driver", "src/com/homesite/client/test/browser_driver/IEDriverServer.exe");
	  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();   
	  caps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");
	  driver = new InternetExplorerDriver(caps); 
	  driver.get("https://www.homesite.com");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
		  
		  //String IE_DRIVER = "src/com/homesite/client/test/browser_driver/IEDriverServer.exe";		  
//		  File file = new File("src/com/homesite/client/test/browser_driver/IEDriverServer.exe");		  
//		  System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		  driver = new InternetExplorerDriver();
		  //LogClass.log.info("Opened with Firefox Browser");		  
//		  driver.manage().window().maximize();
//		  driver.navigate().to("http://www.homesite.com");
	
		  
//********************************************************		  
		  
	  }
	  @Test
	  public void f() {
		  driver.findElement(By.className("glyphicon iconPolicy <!--icon-policy-->")).click();
		  
	  }
	  	  
	  @AfterMethod
	  public void afterMethod() {
		  driver.manage().deleteAllCookies();
		  driver.quit();
	  }

	}