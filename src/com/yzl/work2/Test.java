package com.yzl.work2;

public class Test {

	public static void main(String[] args) {
		TicketThread r = new TicketThread();
		Thread t1 = new Thread(r, "������");
		Thread t2 = new Thread(r, "��ƱƱ");
		Thread t3 = new Thread(r, "��ţ��");
//		Thread t4 = new Thread(r, "��ţ��2");
//		Thread t5 = new Thread(r, "��ţ��3");
//		Thread t6 = new Thread(r, "��ţ��4");
//		Thread t7 = new Thread(r, "��ţ��5");
//		Thread t8 = new Thread(r, "��ţ��6");
//		Thread t9 = new Thread(r, "��ţ��7");
//		Thread t10 = new Thread(r, "��ţ��8");
		
		t1.start();t2.start();t3.start();
//		t4.start();t5.start();
/*		t6.start();t7.start();t8.start();t9.start();t10.start();
		t*/
	}
}
