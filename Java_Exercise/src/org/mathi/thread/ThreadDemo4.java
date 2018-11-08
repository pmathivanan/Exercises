package org.mathi.thread;

public class ThreadDemo4 {
	public static void main(String[] args) {
		
	Runnable r = ()-> System.out.println("Test");
	Thread t = new Thread(r);
	t.start();
	}

}
