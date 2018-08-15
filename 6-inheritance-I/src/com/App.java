package com;

import com.emp.NonTechEmployee;
import com.emp.TechEmployee;

public class App {

	public static void main(String[] args) {

		TechEmployee techEmployee = new TechEmployee(101);
		
		NonTechEmployee nonTechEmployee=new NonTechEmployee(102);

		// -----------------------------------------------
		System.out.println(techEmployee.getId());
		// -----------------------------------------------

	}

}
