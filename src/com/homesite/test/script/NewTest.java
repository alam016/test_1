package com.homesite.test.script;





import homesite.DDT.ExcelLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
//	  ExcelLib excel = new ExcelLib("C:\\Users\\Mithu\\Desktop\\Se_Software_2\\Data.xlsx");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("http://www.homesite.com");	  
	  
  }
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  ExcelLib excel = new ExcelLib("C:\\Users\\Mithu\\Desktop\\Se_Software_2\\Data1.xls");
	  driver.findElement(By.xpath("//*[text()[contains(.,'Claims and policy')]]")).click();	
	  driver.findElement(By.xpath("//*[text()[contains(.,'quote')]]")).click();	
	  System.out.println(
			     driver.findElements(By.className("quoteText"))
			     .size()
			     );
	  
	  String excelData = excel.GetCellValue(0, 1);
	  System.out.println(excelData);
	  driver.findElement(By.className("quoteText")).sendKeys(excelData);
	  //driver.findElement(By.className("quoteText")).sendKeys("11432");
	  driver.findElement(By.name("submit")).click();
  }

  
  @AfterMethod
  public void afterMethod() {
//	  driver.manage().deleteAllCookies();
//	  driver.quit();
  }

}
