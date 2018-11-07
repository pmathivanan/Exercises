package org.mathi.factory.pojo;

public class Lincoln implements Car{
	private String name;
	private String brand;
	private String model;
	
	public Lincoln(String name, String model,String brand){
		this.name=name;
		this.brand=brand;
		this.model=model;

}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}
}