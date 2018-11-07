package org.mathi.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		System.out.println(s);
		System.out.println(Singleton.getInstance());
	}

}
