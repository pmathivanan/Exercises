package org.mathi.thread;

public class ThreadDemo2 {
	public static void main(String[] args) {
		ThreadDemo21 d21=new ThreadDemo21();
		d21.start();
	}

}
class ThreadDemo21 extends Thread {
	
public void	run(){
		System.out.println("Test");
	}
	
}

