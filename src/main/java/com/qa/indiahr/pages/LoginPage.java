package com.qa.indiahr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.indiahr.constants.AppConstants;
import com.qa.indiahr.utils.ElementUtil;



public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	//private locators
	private By Username= By.xpath("//input[contains(@id,'Name')]");
	private By Password= By.xpath("//input[contains(@placeholder,'Enter Password')]");
	private By Login=By.xpath("//button[contains(.,'Sign In')]");
	private By forgotpasswordLink = By.linkText("Forgot password");
	private By privacyLink = By.linkText("Privacy Policy");
	private By checkbox= By.xpath("//input[contains(@id,'rememberMeCheck')]");
	private By logo= By.xpath("//img[contains(@alt,'logo')]");
	
	
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
		return eleUtil.waitForElementPresence(logo, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
		
	}

	public boolean isForgotPwdLinkExists() {
		return eleUtil.waitForElementVisible(forgotpasswordLink, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();

	}
	public boolean isPrivacyLinkExist() {
		return eleUtil.waitForElementPresence(privacyLink, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
		
	}
	public void isCheckBoxSelected() {
		eleUtil.doClickWithActionsAndWait(AppConstants.DEFAULT_MEDIUM_TIMEOUT, checkbox);
		
		
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
