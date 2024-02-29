package com.qa.indiahr.pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.indiahr.constants.AppConstants;
import com.qa.indiahr.utils.ElementUtil;



public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	//private locators
	private By Username= By.xpath("//input[contains(@id,'login_Name')]");
	private By Password= By.xpath("//input[contains(@type,'password')]");
	private By Login=By.xpath("//button[@type='submit'][contains(.,'Sign In')]");
	private By forgotpasswordLink = By.linkText("Forgot password");
	private By privacyLink = By.linkText("Privacy Policy");
	private By loginOtp = By.xpath("//button[contains(.,'Login with TOTP')]");
	

	private By checkbox= By.xpath("//input[contains(@id,'rememberMeCheck')]");
	private By logo= By.xpath("//img[@src='./static/media/hrms-logo.33705d65c38cc03d171d.png']");
	
	
	//Page constructor 	
	// 2. page const...
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}

	// 3. page actions/methods:
	//@Step("....getting the login page title.....")
	public String getLoginPageTitle() {
		String title =eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_SHORT_TIMEOUT, AppConstants.LOGIN_PAGE_TITLE_VALUE);
		System.out.println("Login page title is :" +  " "+ title);
		return title;
	}
	//@Step("....getting the login page url.....")
	public String getLoginPageurl() {
		String url = eleUtil.waitForURLContainsAndFetch(AppConstants.DEFAULT_SHORT_TIMEOUT, AppConstants.LOGIN_PAGE_URL_FRACTION_VALUE);
		System.out.println("Login page url is :" +  " "+ url);
		return url;
	}
	
	 public boolean isLogoPresent() {
		 return eleUtil.waitForElementVisible(logo, AppConstants.DEFAULT_LONG_TIMEOUT).isDisplayed();
		 }
	 
	
	 public boolean isForgotPwdLinkExists() { 
		 return eleUtil.waitForElementVisible(forgotpasswordLink,  AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
	 }
	  
	
	
	public void isCheckBoxSelected() {
		eleUtil.doClickWithActionsAndWait(AppConstants.DEFAULT_MEDIUM_TIMEOUT, checkbox);
		
		
	}
	public boolean isPrivacyLinkExist() {
		return eleUtil.waitForElementPresence(privacyLink, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
		
	}
	public boolean isloginOTPExist() {
		return eleUtil.waitForElementPresence(loginOtp, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
		
	}
	
	//@Step("login with username : {0} and password: {1}")
	public DashbaordPage doLogin(String un, String pw) {
		System.out.println("My App Credentials are" + " " +un + ":"+ pw);
		eleUtil.waitForElementVisible(Username, AppConstants.DEFAULT_MEDIUM_TIMEOUT).sendKeys(un);
		
		eleUtil.waitForElementVisible(Password,AppConstants.DEFAULT_MEDIUM_TIMEOUT).sendKeys(pw);;
		eleUtil.doClick(Login);
	
		
		return new DashbaordPage(driver);
	}

}
