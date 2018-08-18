package com;

import com.container.MyCat;

public class App {
	
	public static void main(String[] args) {
		
		MyCat myCat=new MyCat();
		myCat.processsRequest("/login");
		myCat.processsRequest("/register");
		
	}

}
