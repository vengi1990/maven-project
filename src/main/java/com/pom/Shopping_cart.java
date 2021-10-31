package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_cart {
public static WebDriver driver;


@FindBy(xpath="//a[@title='Subtract']")
private WebElement minus;

@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement proceed1;

@FindBy(xpath="//textarea[@name='message']")
private WebElement message;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement proceed2;
@FindBy(xpath="//input[@type='checkbox']")
private WebElement checkbox;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement proceed3;


public WebElement getCheckbox() {
	return checkbox;
}

public WebElement getProceed3() {
	return proceed3;
}


public WebElement getProceed2() {
	return proceed2;
}


public Shopping_cart(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);

}


public WebElement getMessage() {
	return message;
}


public static WebDriver getDriver() {
	return driver;
}

public WebElement getMinus() {
	return minus;
}

public WebElement getProceed1() {
	return proceed1;
}

}
