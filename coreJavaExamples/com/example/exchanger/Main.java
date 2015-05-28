package com.example.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	DataBuffer emptyBuffer = new DataBuffer();
	DataBuffer fullBuffer = new DataBuffer();

	public Main() {

		fullBuffer.write();
		
		Exchanger<DataBuffer> exchanger=new Exchanger<DataBuffer>();

		Producer producer = new Producer(exchanger);
		Consumer consumer = new Consumer(exchanger);

		new Thread(producer).start();
		new Thread(consumer).start();

	}

	class Producer implements Runnable {

		Exchanger<DataBuffer> exchanger;
		
		public Producer(Exchanger<DataBuffer> exchanger) {
			this.exchanger= exchanger;
		}
		public void run() {
			DataBuffer currentBuffer=emptyBuffer;
			while (true) {

				if(!currentBuffer.isFull()){
					currentBuffer.write();
					System.out.println("Produced!");
				}else{
					try {
						currentBuffer=exchanger.exchange(currentBuffer);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}

		}
	}

	class Consumer implements Runnable {

		Exchanger<DataBuffer> exchanger;
		
		public Consumer(Exchanger<DataBuffer> exchanger) {
			this.exchanger= exchanger;
		}
		public void run() {
			DataBuffer currentBuffer=fullBuffer;
			while (true) {
				
				if(!currentBuffer.isEmpty()){
					int value=currentBuffer.read();
					System.out.printf("Consumed : %d%n",value);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					try {
						currentBuffer=exchanger.exchange(currentBuffer);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}

		}
	}

	class DataBuffer {

		List<Integer> data = new ArrayList<Integer>();

		public void write() {
			for (int i = 1; i <= 10; i++) {
				int val = (int) (Math.random() * 100);
				data.add(val);
			}
		}

		public int read() {
			int idx = (data.size() - 1);
			int val = data.get(idx);
			data.remove(idx);
			return val;
		}

		public boolean isFull() {
			if (data.size() == 10)
				return true;
			return false;
		}

		public boolean isEmpty() {
			if (data.size() == 0)
				return true;
			return false;
		}

	}
}
