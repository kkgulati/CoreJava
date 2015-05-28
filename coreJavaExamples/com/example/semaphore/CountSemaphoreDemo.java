package com.example.semaphore;

import java.util.concurrent.Semaphore;

public class CountSemaphoreDemo {
	
	public static void main(String[] args) {
		
		Semaphore semaphore=new Semaphore(6);
		System.out.println(semaphore.availablePermits());
		
		DatabaseTask databaseTask=new DatabaseTask(semaphore);
		
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		new Thread(databaseTask).start();
		
	}
}

class DatabaseTask implements Runnable{
	
	Semaphore semaphore;
	
	public DatabaseTask(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			semaphore.acquire(3);
			System.out.println(semaphore.availablePermits());
				//InitialContext ic=new InitialContext();
				//DataSource dataSource=ic.lookup("oracledsn");
				//Connection connection=dataSource.getConnection();
				System.out.println("Got Connection from ConnectionPool");
				Thread.sleep(2000);
				//Do JDBC Stuff
			semaphore.release(3);
			System.out.println(semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
