package com.miniproject1;

import com.baseclass.Base_Class;
import com.configuration.Helper;
import com.pom.SDP;

public class Mini_pro extends Base_Class {
public static void main(String[] args) throws Throwable {
	String browser = Helper.getinstance().getinstanceCR().getbrowser();
	browser_launch(browser);
	String url = Helper.getinstance().getinstanceCR().geturl();
	geturl(url);
	maximize();
	implicit();
	SDP s=new SDP(driver);	
	click(s.getL().getLogin());
	thread(4000);	
	inputvalue(s.getLp().getLogin(), "vengi1990@gmail.com");
	inputvalue(s.getLp().getPassword(), "vengat@90");
	implicit();
	click(s.getLp().getSubmit());
	moveto(s.getWd().getWomen());
	click(s.getWd().getSummer_dress());
	implicit();
	click(s.getWd().getSummer());
	implicit();
	frameselement(s.getPs().getMoveto());

	for (int i = 0; i <4; i++) {
		click(s.getPs().getQuantity());
	}
	byvalue(s.getPs().getSize(), "3");
	click(s.getPs().getColor());
	click(s.getPs().getAdd_cart());
	implicit();
	screenshot();
	defaultframe();
	click(s.getPs().getProceed());
	implicit();
	
	for(int i=0;i<2;i++)
	{
		click(s.getSc().getMinus());
	}
	
	click(s.getSc().getProceed1());
	implicit();
	inputvalue(s.getSc().getMessage(), "deleiver my order as soon as possible");
	click(s.getSc().getProceed2());
	implicit();
	click(s.getSc().getCheckbox());
	click(s.getSc().getProceed3());
	implicit();
	click(s.getCo().getBank());
	click(s.getCo().getConfirm());
	implicit();
	click(s.getCo().getSignout());
	screenshot1();
	close();
}
}
