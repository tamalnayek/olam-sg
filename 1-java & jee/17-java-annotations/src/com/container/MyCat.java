package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyCat {

	public void processsRequest(String incomingUrl) {

		// -----------------------------------------------

//
//		UserComponent userComponent = new UserComponent();  // staticall loading class & creating instance
//		if (url.equals("/login")) {
//			userComponent.doLogin();
//		}
//		if (url.equals("/register")) {
//			userComponent.doRegister();
//		}

		// -----------------------------------------------

		try {
			Class<?> clazz = Class.forName("com.component.UserComponent"); // dynamically loading class
			Object instance = clazz.newInstance(); // creating instance

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					String givenUrl = rm.url();
					String givenMethod = rm.httpMethod();

					if (incomingUrl.equals(givenUrl)) {
						method.invoke(instance, new Object[] {});
					}
				}

			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
