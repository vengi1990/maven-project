package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SDP {

	public static WebDriver driver;
	
	private Login l;
	private Create_account c;
	private Women_Dress wd;
	private Login_page lp;
	private Print_summer ps;
	private Shopping_cart sc;
	private Confirm_order co;
	
	public SDP(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	public Confirm_order getCo() {
		co=new Confirm_order(driver);
		return co;
	}
	public Shopping_cart getSc() {
		sc=new Shopping_cart(driver);
		return sc;
	}

	public static WebDriver getDriver() {
		return driver;
	}
	

	public Login getL() {
		l=new Login(driver);
		return l;
	}


	public Create_account getC() {
		c=new Create_account(driver);
		return c;
	}
	public Print_summer getPs() {
		ps=new Print_summer(driver);
		return ps;
	}
	
	public Login_page getLp() {
		lp=new Login_page(driver);
		return lp;
	}

	
	public Women_Dress getWd() {
		wd=new Women_Dress(driver);
		return wd;
	}


}
