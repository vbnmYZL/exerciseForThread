package com.yzl.work1;

public class YoungThread implements Runnable {

	private int speed = 500;  //����ÿ100��
	private int distance = 1000;  //��
	
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
			System.out.println("����������100��");
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�����˵����յ㣡");

	}
	

}
