package com.yzl.work3;

public class ShareData {

	private char c;
	private boolean isProduced = false;
	
	public synchronized void putShareChar(char c) {
		if(isProduced) {
			try {
				System.out.println("�����߻�δ���ѣ�ֹͣ����");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.c = c;
		isProduced = true;
		notify();
		System.out.println("�����˲�Ʒ"+c+",֪ͨ���������ѡ�����");
	}
	
	public synchronized char getShareChar() {
		if(!isProduced) {
			try {
				System.out.println("�����߻�δ������ֹͣ����");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		isProduced = false;
		notify();
		System.out.println("�����˲�Ʒ"+c+",֪ͨ����������������");
		return this.c;
	}
}
