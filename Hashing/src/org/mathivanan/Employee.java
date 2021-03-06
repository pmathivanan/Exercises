package org.mathivanan;

public class Employee {
	
	private String name;
	
	private String sex;
	
	Employee (final String name, final String sex){
		this.name=name;
		this.sex=sex;
	}

	public String getName() {
		return this.name;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public boolean equals(Employee that) {
		return this.name==that.name && this.sex==that.sex;
		
	}
	@Override
	public int hashCode() {
		return name.hashCode()*sex.hashCode()%16;
	}
}
