package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.baseclass.Base_Class;
import com.configuration.Helper;
import com.pom.SDP;
public class Mini_Project extends Base_Class {
public static void main(String[] args) throws Throwable {
	String browser = Helper.getinstance().getinstanceCR().getbrowser();
	browser_launch(browser);
	String url = Helper.getinstance().getinstanceCR().geturl();
	geturl(url);
	maximize();
	thread(4000);
	SDP s=new SDP(driver);	
	click(s.getL().getLogin());
	thread(4000);	
	inputvalue(s.getL().getEmail(),"vengi2021@gmail.com");
	thread(4000);	
	click(s.getL().getSubmit());
	thread(4000);	
	click(s.getC().getRadio());
	thread(4000);	
	inputvalue(s.getC().getFirstname(),"Vengatesh");
	inputvalue(s.getC().getLastname(),"Balu");
	inputvalue(s.getC().getPassword(),"vengat@90");
	byvalue(s.getC().getDays(),"10");
	byvalue(s.getC().getMonths(),"12");	
	byvalue(s.getC().getYears(),"1990");	;
	click(s.getC().getNewslet());	
	click(s.getC().getOptin());	
	inputvalue(s.getC().getLastname1(),"Vengatesh");	
	inputvalue(s.getC().getLastname1(),"Balu");
	inputvalue(s.getC().getCompany(),"Greens Technology");	
	inputvalue(s.getC().getAdd1(),"28, subhathraflats");	
	inputvalue(s.getC().getAdd2(),"Tellus Avenue Phase1");	
	inputvalue(s.getC().getCity(),"chennai");
	thread(4000);	
	byvalue(s.getC().getState(),"5");	
	byvalue(s.getC().getCountry(),"21");
	thread(4000);
	inputvalue(s.getC().getZip(),"62073");
	thread(4000);	
	inputvalue(s.getC().getHome(),"043162073");
	inputvalue(s.getC().getMobile(),"9965869078");	
	inputvalue(s.getC().getMyadd(),"Trichy");	
	click(s.getC().getRegister());
	thread(4000);
	screenshot();
}
}
