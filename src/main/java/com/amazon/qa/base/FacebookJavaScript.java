package com.amazon.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJavaScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://automationpractice.com/index.php");
		 
		 
		 
		 WebElement wb = driver.findElement(By.id("search_query_top"));
	     JavascriptExecutor jse = (JavascriptExecutor)driver;     
	     jse.executeScript("arguments[0].value='shert';", wb);
	
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//button[contains(@class,'btn btn-default')])[1]")).click();
	     
	     System.out.println("click the btn");
	     
	     driver.close();
		
		
		
		
		
	}

}
