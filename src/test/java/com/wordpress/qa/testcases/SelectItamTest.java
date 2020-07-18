package com.wordpress.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.SelectItam;
import com.amazon.qa.util.ExtentClass;

public class SelectItamTest extends TestBase{
	
	SelectItam SelectIta;
	
	public SelectItamTest() {
		super();
	}
	
	@BeforeTest(groups = { "Smoke", "Regression","SytemTest" })
	public void startTest() {
		ExtentClass.setExtent();
	}

	@BeforeMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void setup() {
		initialization();
		SelectIta = new SelectItam();
	}
	@Test(priority=1,groups = { "Regression"})
	public void loginPageTitleTest() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		Thread.sleep(3000);
		SelectIta.SelectItem(prop.getProperty("Itam"));
		//Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		log.debug("loginPageTitleTest ends");
	}
	
	
	
	@AfterMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void tearDown(ITestResult result) throws IOException {
		ExtentClass.setResult(driver, result);
		driver.quit();
	}

	@AfterTest(groups = { "Smoke", "Regression","SytemTest" })
	public void endTest() {
		ExtentClass.endExtent();
		ExtentClass.closeExtent();
	}
	
	
	

}
