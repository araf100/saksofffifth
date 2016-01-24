package com.pom.controller;

import org.openqa.selenium.WebDriver;

import com.pom.framework.BasePage;
import com.pom.framework.SaksHomePage;





public class SaksAppPage extends BasePage{
	
	private SaksHomePage saksHomePage;
	
	

	public SaksAppPage(WebDriver driver) {
		super(driver);
		
	}

	public SaksHomePage saksHomePage(){
		if(saksHomePage == null){
			saksHomePage = new SaksHomePage(driver);
		}
		return saksHomePage;
	}
}
