package com.yzl.work1;

public class NormalThread implements Runnable {

	private Thread tx;
	
	public NormalThread(Thread t) {
		super();
		tx = t;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("��ͨ�ţ�"+(i+1)+"�Ų������ڿ���");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==9) {
				try {
					tx.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
	}

}
