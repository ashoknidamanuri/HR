package com.qa.indiahr.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.indiahr.base.BaseTest;
import com.qa.indiahr.constants.AppConstants;


public class LoginPageTest extends BaseTest{

	
	@Test(priority = 0)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE_VALUE);
	
	}
	@Test(priority = 1)
	public void loginPageUrlTest() {
		String actUrl = loginPage.getLoginPageurl();
		Assert.assertTrue(actUrl.contains(AppConstants.LOGIN_PAGE_URL_FRACTION_VALUE));
	}
	
	@Test(priority = 2)
	public void forgotPwdLinkExistsTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExists());
	}
	@Test(priority =3)
	public void PrivacyLinkExist() {
		Assert.assertTrue(loginPage.isPrivacyLinkExist());
	}
	@Test(priority = 4)
	public void CheckboxSelected() {
		loginPage.isCheckBoxSelected();
		
	}
	@Test(priority = 5)
	public void isLogoExist() {
		Assert.assertTrue(loginPage.isLogoPresent());
	}
	
	@Test(priority = 6)
	public void doLoginTest() {
		dsPage =loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		Assert.assertTrue(dsPage.isLogoutLinkExist());
	}
}
