package com.yzl.work3;

public class Consumer extends Thread {

	private ShareData s;
	
	Consumer(ShareData s) {
		this.s = s;
	}
	
	public void run() {
		char ch;
		do {
			try {
				Thread.sleep((int)(Math.random() * 3000));
			} catch(InterruptedException e) {
				;e.printStackTrace();
			}
			ch = s.getShareChar();
		} while (ch != 'D');		
	}
}
