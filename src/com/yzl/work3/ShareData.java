package com.yzl.work3;

public class ShareData {

	private char c;
	private boolean isProduced = false;
	
	public synchronized void putShareChar(char c) {
		if(isProduced) {
			try {
				System.out.println("消费者还未消费，停止生产");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.c = c;
		isProduced = true;
		notify();
		System.out.println("生产了产品"+c+",通知消费者消费。。。");
	}
	
	public synchronized char getShareChar() {
		if(!isProduced) {
			try {
				System.out.println("生产者还未生产，停止消费");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		isProduced = false;
		notify();
		System.out.println("消费了产品"+c+",通知生产者生产。。。");
		return this.c;
	}
}
