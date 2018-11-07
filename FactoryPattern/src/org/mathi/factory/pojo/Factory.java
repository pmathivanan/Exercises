package org.mathi.factory.pojo;

public class Factory {
	
	public static Car getCar(String name,String brand,String model) {
		if("Ford".equals(brand))
		{
			return new Ford(name,brand,model);
		}
		else if("Lincoln".equals(brand))
		{
			return new Lincoln(name,brand,model);
		}
		return null;
	}

}
