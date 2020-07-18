package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class SelectItam extends TestBase {

	@FindBy(xpath = "//input[@placeholder='Search for Vegetables and Fruits']")
	WebElement Textbox;

	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	WebElement Addtocart;
	
	public SelectItam() {
		PageFactory.initElements(driver, this);
	}

	public void SelectItem(String Item) throws Throwable  {
			Action.type(Textbox, Item);
			Action.click(driver, Addtocart);
 
		}

}
