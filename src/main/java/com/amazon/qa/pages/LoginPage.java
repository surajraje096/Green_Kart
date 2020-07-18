/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - Method
	
	@FindBy(linkText = "Login")
	WebElement login;

	@FindBy(xpath = "(//input[contains(@class,'_2zrpKA _2rqcw-')])[1]")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Lost your password?')]")
	WebElement lostyourPassrd;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	WebElement wordpressLogo;
	
	@FindBy(xpath = "//*[@id=\"at-cv-lightbox-close\"]")
	WebElement popup;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public  void validateLoginPageTitle() throws Throwable {
	// driver.findElement(By.xpath("popup")).click();
		

		
		
		
		Action.click(driver, popup);
	}

	public boolean logo() throws Throwable {

		//return wordpressLogo
		return Action.isDisplayed(driver, wordpressLogo);
		//return wordpressLogo.isDisplayed();
	}
	

	public HomePage login(String un,String pwd) throws Throwable {

		
	//	Action.click(driver, login);
		driver.switchTo().frame(0);
		Action.type(username, un);
		Action.type(password, pwd);
		Action.click(driver, loginButton);
		return new HomePage();

	}

}
