package com.ci.demo;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebservicesTest {
@Test
public void webserviceTestcase(){
	
	System.out.println("*********************************");
	System.out.println("*Web Services Test is initiated**");
	System.out.println("*********************************");
	System.out.println("*********************************");
	
	WebDriver driver;
	File file = null;
		file = new File("Resources//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath()); 
		System.out.println(file.getAbsolutePath());
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://freegeoip.net/json");
	     System.out.println(driver.findElement(By.xpath("//body/pre[text()]")).getText());
	     
	     
	     if(driver.findElement(By.xpath("//body/pre[text()]")).getText().contains("GBc")){
	    	 System.out.println("Web Testing passed");
	    	 driver.quit();
	    	 assertTrue(true);
	    		

	    	}
	    	else{
	    		System.out.println("Web Testing Failed");	
		    	 driver.quit();
          
	    		assertTrue(false);
	    	}
	    		driver.quit();	
	    		}
	
}

