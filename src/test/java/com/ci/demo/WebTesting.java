package com.ci.demo;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTesting {
	
@Test
	public void launchBrowser() throws InterruptedException{
	System.out.println("*********************************");
	System.out.println("**** Web Testing is initiated****");
	System.out.println("*********************************");
	System.out.println("*********************************");
	WebDriver driver;
	File file = null;
		file = new File("Resources//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath()); 
		System.out.println(file.getAbsolutePath());
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@title='Search']")).clear();
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("UST GLOBAL");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

	Thread.sleep(2000);
    String title=driver.getTitle();

if(title.equalsIgnoreCase("UST GLOBAL - Google Search")){
	driver.quit();	
	assertTrue(true);

}
else{
	driver.quit();	

	assertTrue(false);

}
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	

