package org.mathivanan;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee emp=new Employee("Mathi","Male");
		Employee emp1=new Employee("Mathi","Male");
		HashMap<Employee,Employee> hashMap=new HashMap<>();
		hashMap.put(emp, emp);
		hashMap.put(emp1, emp1);
		hashMap.put(new Employee("Mathis","Male"), emp1);
		hashMap.put(new Employee("Mathik","Male"), emp1);
		hashMap.put(new Employee("Mathia","Male"), emp1);
		hashMap.put(new Employee("Mathib","Male"), emp1);
		hashMap.put(new Employee("Mathic","Male"), emp1);
		hashMap.put(new Employee("Mathid","Male"), emp1);
		hashMap.put(new Employee("Mathie","Male"), emp1);
		hashMap.put(new Employee("Mathif","Male"), emp1);
		hashMap.put(new Employee("Mathig","Male"), emp1);
		hashMap.put(new Employee("Mathih","Male"), emp1);
		hashMap.put(new Employee("Mathii","Male"), emp1);
		hashMap.put(new Employee("Mathij","Male"), emp1);
		hashMap.put(new Employee("Mathim","Male"), emp1);
		hashMap.put(new Employee("Mathil","Male"), emp1);
		hashMap.put(new Employee("Mathin","Male"), emp1);
		hashMap.put(new Employee("Mathio","Male"), emp1);
		hashMap.put(new Employee("Mathip","Male"), emp1);
		hashMap.put(new Employee("Mathiq","Male"), emp1);
		hashMap.put(new Employee("Mathir","Male"), emp1);
		
		
		
		
		System.out.println(hashMap.size());
		for(Entry<Employee, Employee> employee:hashMap.entrySet()) {
			System.out.println(((Employee)employee.getValue()).getName());
			System.out.println(((Employee)employee.getValue()).getSex());
			
		}
		//System.out.println(hashMap.get(1).equals(hashMap.get(2)));
	}

}
