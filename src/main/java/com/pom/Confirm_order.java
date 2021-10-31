package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_order {
	public static WebDriver driver;

	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout;
	
	public Confirm_order(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignout() {
		return signout;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBank() {
		return bank;
	}

	public WebElement getConfirm() {
		return confirm;
	}

}
