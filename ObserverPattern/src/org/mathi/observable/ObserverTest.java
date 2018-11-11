package org.mathi.observable;

public class ObserverTest {
	
	public static void main(String[] args) {
		VehicleFactory factory= new VehicleFactory(25);
		//factory.addObserver(new LogiticsDashboard());
		//factory.addObserver(new PortDashboard());
		factory.setCount(30);
	}

}
