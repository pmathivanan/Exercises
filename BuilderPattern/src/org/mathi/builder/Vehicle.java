package org.mathi.builder;

public class Vehicle {
	
	private String name;
	
	private String brand;
	
	private String modelYear;
	
	private String vin;

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getModelYear() {
		return modelYear;
	}

	public String getVin() {
		return vin;
	}
	
	private Vehicle(VehicleBuilder builder) {
		this.name=builder.name;
		this.brand=builder.brand;
		this.modelYear=builder.modelYear;
		this.vin=builder.vin;
	}
	
	public static class VehicleBuilder{

		private String name;
		
		private String brand;
		
		private String modelYear;
		
		private String vin;
		
		public VehicleBuilder(String name, String brand){
			this.name=name;
			this.brand=brand;
		}
		
		public VehicleBuilder setModelYear(String modelYear) {
			this.modelYear=modelYear;
			return this;
		}
		
		public VehicleBuilder setVin(String vin) {
			this.vin=vin;
			return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
		
	}
	
}
