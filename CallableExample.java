package com.as.mitt.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable<Integer> {

	
	@Override
	public Integer call() throws Exception {
		Random rand = new Random();
		System.out.println("callable");
		Integer randomNumber = rand.nextInt();
		Thread.sleep(500);
		
		return randomNumber;
	}
}

class CallbleFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask [] randumNumberTasks = new FutureTask[5];
		
		for (int i=0;i<5;i++) {
			Callable callable = new CallableExample();
			
			randumNumberTasks[i] = new FutureTask(callable);
			
			Thread t = new Thread(randumNumberTasks[i]);
			t.start();
			
		}
		for(int i=0; i<5;i++) {
			System.out.println(randumNumberTasks[i].get());
		}
		
	}
}
