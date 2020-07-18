package com.amazon.qa.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQA {

	public static void main(String[] args) throws InterruptedException {
            
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 
		// driver.findElement(By.id("alertButton")).click();
		 driver.findElement(By.id("promtButton")).click();
		 
		/* Alert alert = driver.switchTo().alert();
		 Thread.sleep(5000);
		 alert.accept();
		 */
		 
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(5000);
		
		String sp= alert.getText();
		 System.out.println(sp);
	
		 
		 System.out.println("Allert accept Done");
		 driver.close();
		 
		 
	}

}
