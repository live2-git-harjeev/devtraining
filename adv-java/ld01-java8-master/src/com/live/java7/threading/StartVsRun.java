package com.live.java7.threading;

public class StartVsRun {
public static void main(String[] args) {
	TestThread1 testThread1 = new TestThread1();
	System.out.println(Thread.currentThread().getName());
	//testThread1.start();
	testThread1.run();
}
}

class TestThread1 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
System.out.println("Run!");
	}
}