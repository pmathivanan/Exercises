package org.mathi.observer;

import java.util.Observable;
import java.util.Observer;

public class LogiticsDashboard implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.getClass());
		System.out.println(arg.toString());
	}

}
