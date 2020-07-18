

package com.wordpress.qa.testcases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.util.ExtentClass;


public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() {
		super();
	}

	@BeforeTest(groups = { "Smoke", "Regression","SytemTest" })
	public void startTest() {
		ExtentClass.setExtent();
	}

	@BeforeMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=1,groups = { "Smoke","SytemTest" })
	public void loginPageTitleTest() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		Thread.sleep(3000);
		loginPage.validateLoginPageTitle();
		//Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		log.debug("loginPageTitleTest ends");
	}

	/*@Test(priority=2,groups = { "Regression","SytemTest" })
	public void loginWordPresslogoTest() throws Throwable {
		log.debug("loginWordPresslogoTest start");
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginWordPresslogoTest");
		boolean flag = loginPage.logo();
		Assert.assertTrue(flag);
		log.debug("loginWordPresslogoTest ends");
	}

	@Test(priority=3,groups = { "Smoke","SytemTest" })
	public void loginTest() throws Throwable {
		log.debug("loginTest Start");
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginTest");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(homePage.postLinkIsdisplayed());
	//	homePage=loginPage.login();
		log.debug("loginTest ends");
	}*/

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
