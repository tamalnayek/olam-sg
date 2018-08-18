package com.em.hr;

import com.em.emp.Employee;

public class HR {

	public static void manageEmployees() {

		Employee.tnrName = "Nag";

		Employee e1 = new Employee(); // object-1
		e1.id = 101;
		e1.name = "A";
		e1.salary = 1000.00;

		Employee e2 = new Employee(); // object-2
		e2.id = 102;
		e2.name = "B";
		e2.salary = 2000.00;

		Employee.doTeach();

		e1.doListenAndWork();
		e2.doListenAndWork();

	}

}
