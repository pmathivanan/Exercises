package org.mathi.singleton;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				singleton=new Singleton();
			}
		}
		return singleton;
	}

}
