package com.test;

import org.testng.annotations.Test;

import com.pom.controller.SaksScriptBase;

public class SaksLoginTest extends SaksScriptBase{
	
	@Test
	public void logInTestCasePositive1(){
		
		saksoff().saksHomePage().clickSignInLink();
		saksoff().saksHomePage().userId("shahran2003@hotmail.com", "ruba1234");
		saksoff().saksHomePage().kids().click();
		}

}
