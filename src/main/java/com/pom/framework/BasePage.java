package com.pom.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class BasePage {
protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void delayFor(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException explicit) {

		}

	}
		public void hoverItem(WebElement element) {
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
		}
		
		public WebElement waitForElementDisplayed(final By locator,
				int timeToWaitInSec) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(timeToWaitInSec, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(locator);
					if (element.isDisplayed()) {
						return element;
					}
					return null;
				}
			});
			return foo;
		}
		
		public void waitForElement(){
			  WebDriverWait wait = new WebDriverWait(driver, 15, 100);
			    wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public void jsClick(WebElement element){
			((JavascriptExecutor) driver).executeScript("arguments[0].click()",  element);
		}



}
