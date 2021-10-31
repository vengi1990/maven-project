package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Dress {
 public static WebDriver driver;
 
 

@FindBy(xpath="(//a[@title='Women'])[1]")
 private WebElement women;
 
 @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")
 private WebElement summer_dress;
 
 @FindBy(xpath="//img[@title='Printed Summer Dress']")
 private WebElement summer;
 
 
 public WebElement getSummer() {
	return summer;
}

public Women_Dress(WebDriver driver2) {
	 
	 this.driver=driver2;
	 PageFactory.initElements(driver2, this);
	 
	 
}
 
 public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getSummer_dress() {
		return summer_dress;
	}
 
 
}
