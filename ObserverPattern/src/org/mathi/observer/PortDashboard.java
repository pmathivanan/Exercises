package org.mathi.observer;

import java.util.Observable;
import java.util.Observer;

public class PortDashboard implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("hello port");
		
	}

}
