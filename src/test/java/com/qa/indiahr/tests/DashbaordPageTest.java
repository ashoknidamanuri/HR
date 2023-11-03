package com.qa.indiahr.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.indiahr.base.BaseTest;
import com.qa.indiahr.constants.AppConstants;



public class DashbaordPageTest extends BaseTest{

	@BeforeClass
	public  void accPageSetup(){
		dsPage =loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
	@Test(priority = 0)

	public void dashboardPageTitleTest() {
		String actTitle = dsPage.getDashboardPageTitle();
		Assert.assertEquals(actTitle, AppConstants.DASHBOARD_PAGE_TITLE_VALUE);

	}

	@Test(priority = 1)
	public void dashboardPageURLTest() {
		String actURL = dsPage.getDashboardPageURL();
		Assert.assertTrue(actURL.contains(AppConstants.DASHBOARD_PAGE_URL_FRACTION_VALUE));
	}

	@Test(priority = 2)
  public void isLogoutlinkexist() {
	Assert.assertTrue(dsPage.isLogoutLinkExist());
}

	/*
	 * @Test(priority = 2) public void dasbaordPageHeadersCountTest() { List<String>
	 * headersList=dsPage.getDashboardPageHeadersList();
	 * Assert.assertEquals(headersList.size(),AppConstants.
	 * DASHBOARD_PAGE_HEADERS_COUNT); System.out.println(headersList.size());
	 * Assert.assertEquals(headersList,
	 * AppConstants.EXPECTED_DASHBOARDPAGE_HEADERS_LIST);
	 * System.out.println("Dashboard page headers list" + headersList); }
	 * 
	 * 
	 * @Test(priority = 3) public void dashboardPageHeadersCountTest1() {
	 * List<String> headersList1 =dsPage.getDashboardPageHeadersList1();
	 * Assert.assertEquals(headersList1.size(),
	 * AppConstants.DASHBOARD_PAGE_HEADERS_COUNT1);
	 * System.out.println(headersList1.size()); Assert.assertEquals(headersList1,
	 * AppConstants.EXPECTED_DASHBOARDPAGE_HEADERS_LIST1);
	 * System.out.println("Dashbaord page headers list" + headersList1); }
	 * 
	 * 
	 * @Test(priority = 4) public void dashbaordFooterList() { List<String>
	 * ftList=dsPage.getDashbaordFooterList(); Assert.assertEquals(ftList.size(),
	 * AppConstants.DASHBOARD_PAGE_FOOTER_COUNT); System.out.println(ftList.size());
	 * Assert.assertEquals(ftList, AppConstants.EXPECTED_DASHBOARDPAGE_FOOTER_LIST);
	 * System.out.println("Dashbaord Footer list is " + ftList);
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void rechangeNowLinkExist() {
	 * Assert.assertTrue(dsPage.isRechargeNowLinkExist()); }
	 * 
	 * @Test(priority=6) public void changePasswordLinkExist() {
	 * Assert.assertTrue(dsPage.isChangePasswordLinkExist());
	 * 
	 * 
	 * }
	 */

}


