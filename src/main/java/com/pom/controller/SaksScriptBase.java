package com.pom.controller;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class SaksScriptBase {
	

	protected WebDriver driver = null;
	public final String URL = "http://www.saksoff5th.com/";
	public SaksAppPage saksoff;
	
	@BeforeMethod
	 public void beforeMethod() {
		
		  
		    driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to(URL);
	 }
             @AfterMethod	
			 public void afterMethod() {
				 driver = null;
				 saksoff = null;
				//driver.close();
				  //driver.quit();
			  }
             
             public SaksAppPage  saksoff(){
         		if( saksoff == null){
         			saksoff = new SaksAppPage(driver);
         			}
         			return saksoff;
         			
         			}


}
