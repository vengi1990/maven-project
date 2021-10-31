package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Print_summer {
public static WebDriver driver;

@FindBy(xpath="//i[@class='icon-plus']")
private WebElement quantity;
@FindBy(xpath="//select[@id='group_1']")
private WebElement size;
@FindBy(xpath="//a[@title='Yellow']")
private WebElement color;
@FindBy(xpath="//span[text()='Add to cart']")
private WebElement add_cart;

@FindBy(xpath="//iframe[@class='fancybox-iframe']")
private WebElement moveto;

@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement proceed;


public WebElement getProceed() {
	return proceed;
}

public WebElement getMoveto() {
	return moveto;
}

public Print_summer(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}


public static WebDriver getDriver() {
	return driver;
}

public WebElement getQuantity() {
	return quantity;
}

public WebElement getSize() {
	return size;
}

public WebElement getColor() {
	return color;
}

public WebElement getAdd_cart() {
	return add_cart;
}


}
