package org.mathi.observable;

import org.mathi.observer.LogiticsDashboard;
import org.mathi.observer.PortDashboard;

public class ObserverTest {
	
	public static void main(String[] args) {
		VehicleFactory factory= new VehicleFactory(25);
		//factory.addObserver(new LogiticsDashboard());
		//factory.addObserver(new PortDashboard());
		factory.setCount(30);
	}

}
