package com.yzl.work1;

public class YoungThread implements Runnable {

	private int speed = 500;  //毫秒每100米
	private int distance = 1000;  //米
	
	public YoungThread() {
		super();
	}

	public YoungThread(int speed, int distance) {
		super();
		this.speed = speed;
		this.distance = distance;
	}

	@Override
	public void run() {
		for (int i = 0; i < distance / 100; i++) {
			System.out.println("年轻人爬了100米");
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("年轻人到达终点！");

	}
	

}
