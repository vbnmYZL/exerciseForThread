package com.yzl.work1;

public class Test {

	public static void main(String[] args) {
		/*
		 * Thread main = Thread.currentThread();
		 * 
		 * MyThread t = new MyThread(); // t.start();
		 * 
		 * System.out.println("���߳�����"+Thread.currentThread().getName()+"���ȼ���"+main.
		 * getPriority());
		 * System.out.println("���߳�����"+t.getName()+"���ȼ���"+t.getPriority());
		 * 
		 * main.setPriority(10); t.setPriority(1);
		 * System.out.println("���߳�����"+Thread.currentThread().getName()+"���ȼ���"+main.
		 * getPriority());
		 * System.out.println("���߳�����"+t.getName()+"���ȼ���"+t.getPriority());
		 */
		Runnable r = new Special();
		Thread t2 = new Thread(r);
		Thread t1 = new Thread(new NormalThread(t2));
		
		t1.start();
		t2.start();
		
	}

}
