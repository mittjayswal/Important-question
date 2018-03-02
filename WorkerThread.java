package com.as.mitt.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {

	String command;
	public WorkerThread(String command) {
		this.command = command;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ "start no= "+command);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"end no"+command);
		
	}

	
}
class SimpleThreadPool{
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i=0; i<10; i++) {
			Runnable r = new WorkerThread(""+i);
			service.execute(r);
		}
		service.shutdown();
		System.out.println("Shutdown");
	}
}
