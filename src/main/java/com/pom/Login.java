package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
public static WebDriver driver;

@FindBy(xpath="//a[@class='login']")
private WebElement login;


@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement email;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement submit;


public Login(WebDriver driver2) {
	
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
public static WebDriver getDriver() {
	return driver;
}

public WebElement getLogin() {
	return login;
}



public WebElement getEmail() {
	return email;
}
public WebElement getSubmit() {
	return submit;
}

}