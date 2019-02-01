package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Registration {
	WebDriver driver;
  @Test(priority=1,enabled=true)
  public void permanentreg() {
	  driver.findElement(By.xpath("//a[text()='Registration']")).click();
	  
	  Select paticientcat=new Select(driver.findElement(By.xpath("//select[@name='PATIENT_CAT']")));
	  paticientcat.selectByIndex(1);
	  
	 Select relation=new Select(driver.findElement(By.xpath("//select[@name='RELATION']")));
	 relation.selectByIndex(1);
	 
	 Select title=new Select(driver.findElement(By.xpath("//select[@name='TITLE']")));
	 title.selectByIndex(1);
	 
	 driver.findElement(By.xpath("//input[@name='MOTHER_NAME']")).sendKeys("srikanth");
	 
	 driver.findElement(By.xpath("//input[@name='PNT_NAME']")).sendKeys("sree");
	 
	 Select patientid=new Select(driver.findElement(By.xpath("//select[@name='PAT_IDENTITY']")));
	 patientid.selectByIndex(1);
	 
	 driver.findElement(By.xpath("//input[@name='MIDDLE_NAME']")).sendKeys("srik");
	 driver.findElement(By.xpath("//input[@name='PAT_IDENTITY_PROOF']")).sendKeys("123");
	 
	 driver.findElement(By.xpath("//input[@name='LAST_NAME']")).sendKeys("sr");
	 driver.findElement(By.xpath("//input[@name='DOB']")).sendKeys("10-01-2010");
	 
	 Select nationality=new Select(driver.findElement(By.xpath("//select[@name='NATIONALITY']")));
	 nationality.selectByIndex(1);
	 
	 driver.findElement(By.xpath("//input[@name='AGE']")).sendKeys("25");
	 
	 Select vip=new Select(driver.findElement(By.xpath("//select[@name='IS_MLC']")));
	 vip.selectByIndex(1);
	 
	 Select gender=new Select(driver.findElement(By.xpath("//select[@name='SEX']")));
	 gender.selectByIndex(1);
	 
	 Select education=new Select(driver.findElement(By.xpath("//select[@name='EDUCATION']")));
	 education.selectByIndex(1);
	 
	 Select mtrlstatus=new Select(driver.findElement(By.xpath("//select[@name='MTRL_STATUS']")));
	 mtrlstatus.selectByIndex(1);
	 
	 Select occupation=new Select(driver.findElement(By.xpath("//select[@name='OCCUPATION']")));
	 occupation.selectByIndex(1);
	 
	 Select religion=new Select(driver.findElement(By.xpath("//select[@name='RELIGION']")));
	 religion.selectByIndex(1);
	 
	 Select bloodgroup=new Select(driver.findElement(By.xpath("//select[@name='BLOOD_GRP_CODE']")));
	 bloodgroup.selectByIndex(1);
	 
	 Select planguage=new Select(driver.findElement(By.xpath("//select[@name='PLANGUAGE']")));
	 planguage.selectByIndex(1);
	 
	 Select citizenship=new Select(driver.findElement(By.xpath("//select[@name='CITIZENSHIP']")));
	 citizenship.selectByIndex(1);
	 
	 Select scproof=new Select(driver.findElement(By.xpath("//select[@name='SC_PROOF']")));
	 scproof.selectByIndex(1);
	 
	 driver.findElement(By.xpath("//input[@name='ADDRESS1']")).sendKeys("hyd");
	 
	 driver.findElement(By.xpath("//input[@name='ADDRESS2']")).sendKeys("hyd");
	 
	 driver.findElement(By.xpath("//input[@name='MOBILE_NO']")).sendKeys("1234567890");
	 
	 driver.findElement(By.xpath("//input[@name='EMAIL_ID']")).sendKeys("sri@gmail.com");
	 
	 driver.findElement(By.xpath("//input[@name='ZIP']")).sendKeys("500090");
	 
	 Select country=new Select(driver.findElement(By.xpath("//select[@name='COUNTRY_CODE']")));
	 country.selectByIndex(1);
	 
	 driver.findElement(By.xpath("//input[@name='image']")).sendKeys("D:\\mani certificate.jpg");
	 
	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	 
	 Alert alert = driver.switchTo().alert();
	  String alertm= driver.switchTo().alert().getText();	
	  System.out.println(alertm);
	  alert.accept(); 
  }
  
  @Test(priority=2,enabled=true)
  public void searchreg() {
	  driver.findElement(By.xpath("//a[text()='Search Registration']")).click();
	  
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("PR4756184389");
	  
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  WebElement mail=driver.findElement(By.xpath("//td[text()='sri@gmail.com']"));
	  String mail1=mail.getText();
	  System.out.println(mail1);
	  if (mail1.equals("sri@gmail.com"))
      { 
       System.out.println("Successfully Passed");
      }
      else
      {
       System.out.println("Failed");
      }
    }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
