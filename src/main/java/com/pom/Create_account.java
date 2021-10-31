package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_account {
	public static WebDriver driver;

	@FindBy(name="id_gender")
	private WebElement radio;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstname;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement lastname;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	//@FindBy(name="day")
	//private WebElement day;
	@FindBy(name="days")
	private WebElement days;
	@FindBy(name="months")
	private WebElement months;
	@FindBy(name="years")
	private WebElement years;
	@FindBy(id="newsletter")
	private WebElement newslet;
	@FindBy(id="optin")
	private WebElement optin;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement firstname1;
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement lastname1;
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement company;
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement add1;
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement add2;
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement city;
	@FindBy(id="id_state")
	private WebElement state;
	@FindBy(id="id_country")
	private WebElement country;
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement zip;
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement home;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement mobile;
	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement myadd;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement register;
	
	public Create_account(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getDays() {
		return days;
	}
	public WebElement getMonths() {
		return months;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getNewslet() {
		return newslet;
	}
	public WebElement getOptin() {
		return optin;
	}
	public WebElement getFirstname1() {
		return firstname1;
	}
	public WebElement getLastname1() {
		return lastname1;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getAdd1() {
		return add1;
	}
	public WebElement getAdd2() {
		return add2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getZip() {
		return zip;
	}
	public WebElement getHome() {
		return home;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getMyadd() {
		return myadd;
	}
	public WebElement getRegister() {
		return register;
	}
	
}
