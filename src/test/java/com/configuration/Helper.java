 package com.configuration;

public class Helper {
	public Reader getinstanceCR() throws Throwable {
Reader r=new Reader();
return r;
	}
	public static Helper getinstance(){
		Helper h=new Helper();
		return h;
	}
	public Helper() {
		
	}
}

