package com.yzl.work1;

public class OldThread implements Runnable {

	private int speed = 1000;  //毫秒每100米
	private int distance = 500;  //米
	
	public OldThread() {
		super();
	}

	public OldThread(int speed, int distance) {
		super();
		this.speed = speed;
		this.distance = distance;
	}

	@Override
	public void run() {
		for (int i = 0; i < distance / 100; i++) {
			System.out.println("老人爬了100米");
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("老人到达终点！");
		
	}
	

}
