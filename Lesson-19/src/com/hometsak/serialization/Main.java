package com.hometsak.serialization;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Employee em = new Employee(1,"Arin", 2000);
		Employee em2 = new Employee(2,"Mary", 4200);
		
		Employee.serialezib(em);
		System.out.println(Employee.deserialezib());
		Employee.serialezib(em2);
		System.out.println(Employee.deserialezib());
		
		System.out.println();
		
		ArrayList<Employee> col = new ArrayList<Employee>();
		col.add(em);
		col.add(em2);
		col.add(new Employee(3,"Ervin", 3450));
		Employee.serialezib(col);
		System.out.println(Employee.deserialezib());
	}

}
