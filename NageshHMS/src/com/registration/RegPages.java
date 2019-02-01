package com.registration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegPages {
	public WebDriver driver;
	public String wt;
	Select s;
	  
    @FindBy(xpath="//form[@method='post']/input[1]")
    public WebElement UnameData;
		
    @FindBy(xpath="//input[@name='password']")
	public WebElement PasswordData;
	  
    @FindBy(xpath="//input[@name='submit']")
	public WebElement LoginClick;
    
    @FindBy(xpath="//div[@class='border']/h3")
    public WebElement WelcomeTitle;
    
	
	@FindBy(xpath="//a[text()='Registration']")
	public WebElement RegClick;
	
	@FindBy(xpath="//select[@name='PATIENT_CAT']")
	public WebElement PatientCatDropDown;
	
	@FindBy(xpath="//select[@name='RELATION']")
	public WebElement RelationDropDown;
	
	@FindBy(xpath="//select[@name='TITLE']")
	public WebElement TitleDropDown;
	
	@FindBy(xpath="//input[@name='MOTHER_NAME']")
	public WebElement MNameData;
	
	@FindBy(xpath="//input[@name='PNT_NAME']")
	public WebElement PNameData;
	
	@FindBy(xpath="//select[@name='PAT_IDENTITY']")
	public WebElement PIdentityDropDown;
	
	@FindBy(xpath="//input[@name='MIDDLE_NAME']")
	public WebElement MiddleNameData;
	
	@FindBy(xpath="//input[@name='PAT_IDENTITY_PROOF']")
	public WebElement PIdProofData;
	
	@FindBy(xpath="//input[@name='LAST_NAME']")
	public WebElement LNameData;
	
	@FindBy(xpath="//input[@name='DOB']")
	public WebElement DOMData;
	
	@FindBy(xpath="//select[@name='NATIONALITY']")
	public WebElement NationalityDropDown;
	
	@FindBy(xpath="//input[@name='AGE']")
	public WebElement AgeData;
	
	@FindBy(xpath="//select[@name='IS_MLC']")
	public WebElement VIPDropDown;
	
	@FindBy(xpath="//select[@name='SEX']")
	public WebElement GenderDropDown;
	
	@FindBy(xpath="//select[@name='EDUCATION']")
	public WebElement EducationDropDown;
	
	@FindBy(xpath="//select[@name='MTRL_STATUS']")
	public WebElement MtrlStatusDropDown;
	
	@FindBy(xpath="//select[@name='OCCUPATION']")
	public WebElement OccupationDropDown;
	
	@FindBy(xpath="//select[@name='RELIGION']")
	public WebElement RelegionDropDown;
	
	@FindBy(xpath="//select[@name='BLOOD_GRP_CODE']")
	public WebElement BloodGroupDropDown;
	
	@FindBy(xpath="//select[@name='PLANGUAGE']")
	public WebElement PLanguageDropDown;

	@FindBy(xpath="//select[@name='CITIZENSHIP']")
	public WebElement CitizenshipDropDown;
	
	@FindBy(xpath="//select[@name='SC_PROOF']")
	public WebElement SCProofDropDown;
	
	@FindBy(xpath="//input[@name='ADDRESS1']")
	public WebElement Address1Data;
	
	@FindBy(xpath="//input[@name='ADDRESS2']")
	public WebElement Address2Data;
	
	@FindBy(xpath="//input[@name='MOBILE_NO']")
	public WebElement MobileNoData;
	
	@FindBy(xpath="//input[@name='EMAIL_ID']")
	public WebElement EmailIdData;
	
	@FindBy(xpath="//input[@name='ZIP']")
	public WebElement ZipData;
	
	@FindBy(xpath="//select[@name='COUNTRY_CODE']")
	public WebElement CountryDropDown;
	
	@FindBy(xpath="//input[@name='image']")
	public WebElement ImageData;
	
	@FindBy(xpath="//input[@name='submit']")
	public WebElement SaveClick;
	
	
	
	@FindBy(xpath="//*[@id=\"navigation\"]/li[1]/ul/li[3]/a")
	public WebElement SearchRegClick;
	
	@FindBy(xpath="//input[@name='search']")
	public WebElement SearchData;
	
	@FindBy(xpath="//input[@name='submit']")
	public WebElement SearchButtonClick;
	
	@FindBy(xpath="(//td[text()='sri@123'])[1]")
	public WebElement GmailText;
	
	@FindBy(tagName="a")
	public WebElement Links;
	
	public RegPages(WebDriver ldriver) {
    this.driver=ldriver;
	}
	
	public void LoginDetails(String Username, String password) {
		UnameData.sendKeys(Username);
		PasswordData.sendKeys(password);
		LoginClick.click();
		String title=WelcomeTitle.getText();
		String[] t1=title.split(" ");
		wt =t1[1];
		 System.out.println(wt);
	}
	
	public void links() {
		String L=Links.getText();
		System.out.println(L);
		
	}
	
	public void RegDetails() {
		RegClick.click();
		
	     s=new Select(PatientCatDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(RelationDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(TitleDropDown);
		 s.selectByIndex(1);
		 
		 MNameData.sendKeys("sree");
		 PNameData.sendKeys("srii");
		 
		 s=new Select(PIdentityDropDown);
		 s.selectByIndex(1);
		 
		 MiddleNameData.sendKeys("gggg");
		 PIdProofData.sendKeys("123456");
		 LNameData.sendKeys("sreee");
		 DOMData.sendKeys("10-12-2222");
		 
		 s=new Select(NationalityDropDown);
		 s.selectByIndex(1);
		 
		 AgeData.sendKeys("27");
		 
		 s=new Select(VIPDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(GenderDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(EducationDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(MtrlStatusDropDown);
		 s.selectByIndex(1);
		 
		 
		 s=new Select(OccupationDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(RelegionDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(BloodGroupDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(PLanguageDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(CitizenshipDropDown);
		 s.selectByIndex(1);
		 
		 s=new Select(SCProofDropDown);
		 s.selectByIndex(1);
		 
		 Address1Data.sendKeys("hyd");
		 Address2Data.sendKeys("hyd1");
		 MobileNoData.sendKeys("1234567890");
		 EmailIdData.sendKeys("sri@123");
		 ZipData.sendKeys("500000");
		 
		 s=new Select(CountryDropDown);
		 s.selectByIndex(1);
		
		 ImageData.sendKeys("D:\\mani certificate.jpg");
		 SaveClick.click();	 
	}
	 
	public void SearchDetails(String no) {
		SearchRegClick.click();
		SearchData.sendKeys(no);
		SearchButtonClick.click();
	}

}
