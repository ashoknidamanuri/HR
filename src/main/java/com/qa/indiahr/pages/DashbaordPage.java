package com.qa.indiahr.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.indiahr.constants.AppConstants;
import com.qa.indiahr.utils.ElementUtil;

public class DashbaordPage {

	private ElementUtil eleUtil;
	public WebDriver driver;
    private By myprofile= By.xpath("//img[contains(@class,'accountImage')]");
	private By logoutLink = By.xpath("//a[contains(.,'Logout')]");

	/*
	 * private By profilelink=By.xpath("//div[@id='vg_header_user_menu_toggle']");
	 * 
	 * private By logoutLink = By.xpath("//a[contains(.,'Logout')]"); private By
	 * changepassword=By.linkText("Change Password"); private By dasboardHeaders =
	 * By.
	 * xpath("//div[@class='menu-item  menu-lg-down-accordion me-lg-1']//span[@class='menu-title']"
	 * ); private By dasboardHeader = By.
	 * xpath("//div[@class='menu-item menu-lg-down-accordion me-lg-1']//span[@class='menu-link py-3']//span[@class='menu-title']"
	 * ); private By footerList=By.
	 * xpath("//div[contains(@class,'d-flex flex-column')]//div[contains(@class,'text-dark fw-semibold fs-6')]"
	 * ); private By linktext=By.linkText("Recharge Now");
	 * 
	 * 
	 */
	public DashbaordPage(WebDriver driver) {
		eleUtil = new ElementUtil(driver);
	}

	/*
	 * public String getDashboardPageTitle() { String title =
	 * eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_MEDIUM_TIMEOUT,
	 * AppConstants.DASHBOARD_PAGE_TITLE_VALUE);
	 * System.out.println("Acc page title is : " + title); return title; }
	 * 
	 * public String getDashboardPageURL() { String url =
	 * eleUtil.waitForURLContainsAndFetch(AppConstants.DEFAULT_MEDIUM_TIMEOUT,
	 * AppConstants.DASHBOARD_PAGE_URL_FRACTION_VALUE);
	 * System.out.println("Acc page url : " + url); return url;
	 */
		
		
	//}
	
	public boolean isLogoutLinkExist() {
		eleUtil.clickWhenReady(AppConstants.DEFAULT_MEDIUM_TIMEOUT, myprofile);
		return eleUtil.waitForElementVisible(logoutLink, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
		
	

	}



	/*
	 * public List<String> getDashboardPageHeadersList() {
	 * 
	 * List<WebElement> list= eleUtil.waitForElementsVisible(dasboardHeaders,
	 * AppConstants.DEFAULT_MEDIUM_TIMEOUT);
	 * 
	 * List<String> headersList = new ArrayList<String>(); for(WebElement e : list)
	 * { String text =e.getText(); headersList.add(text); } return headersList; }
	 * public List<String> getDashboardPageHeadersList1() {
	 * 
	 * 
	 * List<WebElement> list1= eleUtil.waitForElementsVisible(dasboardHeader,
	 * AppConstants.DEFAULT_MEDIUM_TIMEOUT); List<String> headersList1 = new
	 * ArrayList<String>(); for(WebElement e : list1) { String text =e.getText();
	 * headersList1.add(text);
	 * 
	 * } return headersList1; } public List<String> getDashbaordFooterList(){
	 * 
	 * 
	 * List<WebElement>flist=eleUtil.waitForElementsVisible(footerList,
	 * AppConstants.DEFAULT_MEDIUM_TIMEOUT); List<String> ftList=new
	 * ArrayList<String>(); for(WebElement k: flist) { String ftext=k.getText();
	 * ftList.add(ftext); } return ftList; } public boolean isRechargeNowLinkExist()
	 * {
	 * 
	 * return eleUtil.waitForElementVisible(linktext,
	 * AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
	 * 
	 * } public boolean isChangePasswordLinkExist() { eleUtil.doClick(profilelink);
	 * 
	 * eleUtil.waitForElementVisible(logoutLink,
	 * AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
	 * 
	 * return eleUtil.waitForElementVisible(changepassword,
	 * AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
	 * 
	 * 
	 * }
	 */
	
		
	}




