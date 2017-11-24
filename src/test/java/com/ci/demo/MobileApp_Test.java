package com.ci.demo;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MobileApp_Test {
	
	
	
	@Test

public  void mobileTestCase() throws MalformedURLException, InterruptedException{
		
		System.out.println("*********************************");
    	System.out.println("**** Mobile Test is initiated****");
    	System.out.println("*********************************");
    	System.out.println("*********************************");

		     AppiumDriver<MobileElement> driver1;	
			File appdir=new File(System.getProperty("user.dir")+"/App/");
			File app=new File(appdir,"selendroid-test-app-0.17.0.apk");
				
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath() );

		    cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		    
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		    
		    cap.setCapability(MobileCapabilityType.BROWSER_NAME,"");
		    
		    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		    
		    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		    
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		    
		    driver1 = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:6666/wd/hub"),cap);
		    
		     driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		        String app_package_name = "io.selendroid.testapp:id/";
		        By userReg = By.id(app_package_name + "startUserRegistration");
		        By userName = By.id(app_package_name + "inputUsername");
		        By email = By.id(app_package_name + "inputEmail");
		        By password = By.id(app_package_name + "inputPassword");
		        By adds = By.id(app_package_name + "input_adds");
		        By register = By.id(app_package_name + "btnRegisterUser");
		        By getUserName = By.id(app_package_name + "label_username_data");


		        
		       // By showPassword = By.id(app_package_name + "show_password");
		    //    By login_Button = By.id(app_package_name + "btn_login");

		        driver1.findElement(userReg).click();
		        driver1.hideKeyboard() ;

		        driver1.findElement(userName).setValue("pavankumar");
		        driver1.findElement(email).setValue("pavan@wolseley.com");
		        driver1.findElement(password).setValue("testing123");
		        driver1.hideKeyboard() ;


		        driver1.findElement(adds).click();
		        Thread.sleep(2000);
		        driver1.findElement(register).click();
		        Thread.sleep(1000);

		        
		    	//Close all driver instances
		    	//Test Ends
			
		    	 
		    	if(("pavankumar".equalsIgnoreCase(driver1.findElement(getUserName).getText()))){
		    		System.out.println("Mobile test Pass");
			    	driver1.quit();

		    		assertTrue(true);
		    	}
		    	else{
		    		assertTrue(false);
			    	driver1.quit();
		    		System.out.println("Mobile test fail");

		    	}
		
		
	}
	
	}
	
