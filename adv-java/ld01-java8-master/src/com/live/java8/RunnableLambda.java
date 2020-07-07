package com.live.java8;

class Dummy {

}
//One issue with anonymous classes is that if the implementation of your anonymous class is very simple, 
//such as an interface that contains only one method, 
//then the syntax of anonymous classes may seem unwieldy and unclear. 

//SOLUTION : LAMBDA EXPRESSIONS MAKES INSTANTIATING ANONYMOUS CLASSES EASIER.

public class RunnableLambda {
// Every program in java starts with a single thread - main thread
	public static void main(String[] args) {
//		usingThreadClass();
//		usingRunnable();
//		usingAnonymousClass();
//		usingRunnableWithLambda();
//		usingLambdaConcise();
	}

	private static void usingAnonymousClass() {
		new Thread() {
			@Override
			public void run() {
				System.out.println("anonymous class used here for child thread!");
			}
		}.start();
	}

	private static void usingLambdaConcise() {
		new Thread(() -> System.out.println("child thread with lambda epxression!")).start();
	}

	private static void usingRunnable() {
		// usingThreadClass();
		TestThreadRunnable testThreadRunnable = new TestThreadRunnable();
		Thread thread = new Thread(testThreadRunnable);
		thread.start();
	}

	private static void usingRunnableWithLambda() {
		// The runnable interface is a functional interface
		// because it has only one abstract method
		// Runnable is the type of lambda expression
		Runnable runnableLambda = () -> System.out.println("anonymous class used here with lambda epxression!");
		Thread thread = new Thread(runnableLambda);
		thread.start();

//		var myvar = function myFunction() {
//			alert("Hello");
//			}
//			alert(myvar());
	}

	private static void usingThreadClass() {
		// Print the name of the main thread
		String threadNameString = Thread.currentThread().getName();
		System.out.println(threadNameString);
		System.out.println(Thread.currentThread().getId());
		TestThread testThread = new TestThread();
		testThread.start();
		// deprecated methods - recommended not to use it.
		// testThread.stop();
	}
}

class TestThread extends Thread {
	@Override
	public void run() {
		try {
			// makes the thread sleep for a predefined interval of time.
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		Thread.currentThread().setName("Child Thread Renamed");
		System.out.println(Thread.currentThread().getId());
		System.out.println("Child Thread : TestThread run()");
		System.out.println(Thread.currentThread().getName());
	}
}

class TestThreadRunnable extends Dummy implements Runnable {
//	@Override
//	public void run1() {
//		System.out.println("Implementing runnable.....");
//
//	}

	public void run() {
		System.out.println("Implementing runnable.....");

	}
}
