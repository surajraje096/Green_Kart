/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath = "//*[@id='wp-admin-bar-my-account']/a/span[contains(text(),'opensourcecms')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//*[@id='menu-posts']//a[contains(text(),'Add New')]")
	WebElement addNewPostLink;
	
	@FindBy(xpath="//*[@id='menu-posts']/a/div[contains(text(),'Posts')]")
	WebElement PostLink;
	
	@FindBy(xpath="//div[contains(text(),'Users')]")
	WebElement usersLink;
	
	@FindBy(xpath="//*[@id='menu-users']//a[contains(text(),'Add New')]")
	WebElement addNewUserLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCorrectUsername() {
		return userNameLabel.isDisplayed();
	}
	
	
	public boolean postLinkIsdisplayed()
	{
		PostLink.isDisplayed();
		return true;
		
	}

}
