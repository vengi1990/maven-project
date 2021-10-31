package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;

	@FindBy(xpath="//input[@id='email']")
	private WebElement Login;


	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement Submit;
	
public WebElement getSubmit() {
		return Submit;
	}


public WebDriver getDriver() {
		return driver;
	}


	public WebElement getLogin() {
		return Login;
	}


	public WebElement getPassword() {
		return Password;
	}

	public Login_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

}
