package com.registration;

import org.testng.annotations.Test;
import com.testbase.BrowsrLaunch;
import com.utils.ExcelUtils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class RegTest {
	RegPages RP;
	String no;
	WebDriver driver;
	BrowsrLaunch bl=new BrowsrLaunch();
	
  @Test(priority=1, dataProvider = "DataDriven")
  public void VerifyingLoginDetailsTest(String name, String pwd) {
	  try {
		RP.LoginDetails(name, pwd); 
		  if(RP.wt.equals("admin")) {
			  System.out.println("pass");
		  }else {
			  System.out.println("fail");
		  }
	} catch (Exception e) {
		driver.switchTo().alert().accept();	
	}	 
  }
  
	  @DataProvider(name = "DataDriven")
	  String [][] getdata() throws IOException, Exception
	  {
	  String path=System.getProperty("user.dir")+"//Exceldata//Book1.xlsx";
	  int rows=ExcelUtils.getRowCount(path, "Sheet1");
	  int cols=ExcelUtils.getCellCount(path, "Sheet1", 1);

	  String logindata[][]=new String[rows][cols];

	  	for(int i=1;i<=rows;i++) {
	  		for(int j=0;j<cols;j++) {
	  logindata[i-1][j]=ExcelUtils.getCellData(path, "Sheet1", i, j);
	  		}
	  	}
	  	return logindata;
	  } 
  
   @Test(priority=2)
  public void VerifyingRegistrationDetailsTest() {
		RP.links();
		RP.RegDetails();
		  Alert a;
		  a=driver.switchTo().alert();
		  String s = a.getText();
			 String[] s1 = s.split(" ");
			 no =s1[4];
			 System.out.println(no);
			 a.accept();
  }
  
  @Test(priority=3)
  public void VerifyingSearchRegDetailsTest() {
	  try {
		RP.SearchDetails(no);
		  String gmail=RP.GmailText.getText();
		 
		  if (gmail.equals("sri@123"))
		  { 
		   System.out.println("Successfully Passed");
		  } else
		  {
		   System.out.println("Failed");
		  }
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
   
  @BeforeTest
  public void beforeTest() {
	   driver=bl.startBrowser("chrome", "http://selenium4testing.com/hms/");
	   RP=  PageFactory.initElements(driver, RegPages.class);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}



































/*
@Test(priority=1)
public void VerifyingLoginDetailsTest() {
	  RP.LoginDetails(); 
	  if(RP.wt.equals("admin")) {
		  System.out.println("pass");
	  }else {
		  System.out.println("fail");
	  }	 
}	  

@Test(priority=2)
public void VerifyingRegistrationDetailsTest() {
	 
		RP.RegDetails();
		  Alert a;
		  a=driver.switchTo().alert();
		  String s = a.getText();
			 String[] s1 = s.split(" ");
			 no =s1[4];
			 System.out.println(no);
			 a.accept();
	
}

@Test(priority=3)
public void VerifyingSearchRegDetailsTest() {
	  try {
		RP.SearchDetails(no);
		  String gmail=RP.GmailText.getText();
		 
		  if (gmail.equals("sri@123"))
		  { 
		   System.out.println("Successfully Passed");
		  } else
		  {
		   System.out.println("Failed");
		  }
	} catch (Exception e) {
		e.printStackTrace();
	}
}*/

/*@BeforeTest
public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms/");
	  RP=  PageFactory.initElements(driver, RegPages.class);
}
*/

