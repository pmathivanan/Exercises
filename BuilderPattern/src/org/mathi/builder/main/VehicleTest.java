package org.mathi.builder.main;

import org.mathi.builder.Vehicle;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle build = new Vehicle.VehicleBuilder("Figo","Ford").setVin("2019").build();
		System.out.println(build.getName());
		System.out.println(build.getBrand());
		System.out.println(build.getModelYear());
		System.out.println(build.getVin());
	}

}
