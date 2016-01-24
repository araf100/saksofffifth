package com.pom.framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SaksHomePage extends BasePage{

	public SaksHomePage(WebDriver driver) {
		super(driver);
		
		
	}
	public WebElement popup;
	public WebElement signInLink;
	public WebElement emailAdd;
	public WebElement selectRadioButton;
	public WebElement password;
	public WebElement signinButton;
	public WebElement kids ;
	
	
	public WebElement popup() {
		popup = driver.findElement(By
				.xpath("//*[@id='js-overlay']/div/div[1]/a[2]/span"));
		return popup;
	}

	public WebElement signInLink() {
		delayFor(1000);
		signInLink = driver.findElement(By.xpath("//*[@id='js-signed-in']"));
		return signInLink;
	}

	public WebElement emailAdd() {
	     
		emailAdd = driver.findElement(By.id("dwfrm_login_username"));
		return emailAdd;
	}
	
	
	public WebElement selectRadioButton() {
		selectRadioButton = driver.findElement(By
				.xpath("//*[@id='js-signin-radio']/div[3]/label/span"));
		return selectRadioButton;
	}
	
	public WebElement password() {
		password = driver.findElement(By
				.xpath("//*[@id='dwfrm_login_password']"));
		return password;
	}
	
	public WebElement signinButton() {
		signinButton = driver.findElement(By
				.xpath("//*[@id='dwfrm_login_register']"));
		return signinButton;
	}
	

	public WebElement kids() {
		kids = driver.findElement(By
				.xpath("//*[@id='js-category-navigation']/div[1]/div/div/ul[1]/li[6]/a"));
		return kids;
	}
	
	
	public void clickSignInLink() {
		popup().click();
		signInLink().click();
	
	}
	

	public void userId(String useremailAdd, String userpassword) {
		delayFor(1000);
		WebElement element = driver.findElement(By.xpath("//*[@id='js-overlay']/div"));
		
		driver.switchTo().frame(element);
		delayFor(1000);
		emailAdd().sendKeys(useremailAdd);
		selectRadioButton().click();
		password().sendKeys(userpassword);
		signinButton().click();
		kids().click();
	}
}
