package com.yzl.work3;

public class Producer extends Thread {

	private ShareData s;
	
	Producer(ShareData s) {
		this.s = s;
	}
	
	public void run() {
		for(char ch = 'A'; ch <= 'D'; ch++) {
			try {
				Thread.sleep((int)(Math.random() * 3000));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			s.putShareChar(ch);
		}
	}
}
