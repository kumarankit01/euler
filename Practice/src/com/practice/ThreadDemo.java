package com.practice;

public class ThreadDemo implements Runnable {
	static ThreadDemo d=new ThreadDemo();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread  t1=new Thread(d, "odd");
		Thread  t2=new Thread(d,"even");
		t1.start();

		t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equalsIgnoreCase("even")){
			synchronized (d) {
				for (int i=0;i<50;i=i+2){
					System.out.print(i+" ");
					d.notifyAll();
					try {
						d.wait(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}

		else if(Thread.currentThread().getName().equalsIgnoreCase("odd")){
			synchronized (d) {
				try {
					d.wait(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i=1;i<50;i=i+2){
					System.out.print(i+" ");
					d.notify();
					try {
						d.wait(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
