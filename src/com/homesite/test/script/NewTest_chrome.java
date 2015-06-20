package com.homesite.test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest_chrome {

  WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src/com/homesite/client/test/browser_driver/chromedriver.exe");  
	  DesiredCapabilities caps = DesiredCapabilities.chrome();
	  driver = new ChromeDriver(caps); 
	  driver.get("https://www.homesite.com");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
  }

  @Test
  public void f() {
	  driver.findElement(By.className(""));
	  
//	  String a = driver.(By.xpath("//div[text()='Sign in to your account']"));
//	  Assert.assertEquals(a, "Sign in to your account");  
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
    driver.manage().deleteAllCookies();
    driver.quit();
	  
	  
  }

}
