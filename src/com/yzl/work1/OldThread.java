package com.yzl.work1;

public class OldThread implements Runnable {

	private int speed = 1000;  //����ÿ100��
	private int distance = 500;  //��
	
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
			System.out.println("��������100��");
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���˵����յ㣡");
		
	}
	

}
