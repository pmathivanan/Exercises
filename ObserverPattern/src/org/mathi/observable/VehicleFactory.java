package org.mathi.observable;

import java.util.Observable;

import org.mathi.observer.LogiticsDashboard;
import org.mathi.observer.PortDashboard;

public class VehicleFactory extends Observable{

	private int vehicleCount;
	
	public VehicleFactory(int vehicleCount) {
	this.vehicleCount=vehicleCount;	 
	}
	
	public void setCount(int count)
	{
		this.vehicleCount=count;
		if(count>100) {
			super.setChanged();
			super.addObserver(new PortDashboard());
			super.notifyObservers("Vehicle count has reached its limit.");
		}
		if(count>25) {
			super.setChanged();
			super.addObserver(new LogiticsDashboard());
			super.notifyObservers("Vehicle count has reached its limit.");
		}
	}
	
	public int getVehicleCount() {
		return this.vehicleCount;
	}
	
}
