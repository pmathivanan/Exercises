package org.mathi.factory.main;

import org.mathi.factory.pojo.Car;
import org.mathi.factory.pojo.Factory;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		Car car=Factory.getCar("Figo", "Ford", "2019");
		System.out.println(car.getBrand());
	}

}
