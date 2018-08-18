package com.component;

import com.container.RequestMapping;

public class UserComponent {

	@RequestMapping(url = "/login", httpMethod = "POST")
	public void m1() {
		System.out.println("login....");
	}

	@RequestMapping(url = "/register", httpMethod = "POST")
	public void m2() {
		System.out.println("register...");
	}

}
