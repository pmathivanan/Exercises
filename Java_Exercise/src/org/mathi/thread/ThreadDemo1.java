package org.mathi.thread;

public class ThreadDemo1 {
	public static void main(String[] args) {
		
	ThreadDemo11 d2=new ThreadDemo11();
	Thread t=new Thread(d2);
	t.start();
	}
}

class ThreadDemo11 implements Runnable{

	@Override
	public void run() {
		System.out.println("Test");
		
	}
	
}
