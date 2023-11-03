package com.qa.indiahr.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.indiahr.factory.DriverFactory;
import com.qa.indiahr.pages.DashbaordPage;
import com.qa.indiahr.pages.LoginPage;

public class BaseTest {
	WebDriver driver;
	DriverFactory df;
	protected Properties prop;
	protected LoginPage loginPage;
	protected DashbaordPage dsPage;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.initProp();
		
		
		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);
		

	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
