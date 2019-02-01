package com.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowsrLaunch {
	WebDriver driver;
	
	
	public WebDriver startBrowser(String browser, String url)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromeDriver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Testing Softwares\\Drivers\\geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/firefoxDriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
	public void Sendkeys(WebElement locator, String Value) {
		locator.sendKeys(Keys.chord(Keys.CONTROL, "a"), Value);
	}
	
	public void Click(WebElement locator) {
		locator.click();
	}
	
	public void Dropdown(WebElement locator, String Value, String num) {
		Select s=new Select(locator);
		 s.selectByValue(num);    
		 s.selectByVisibleText(Value);
	}
	

}
