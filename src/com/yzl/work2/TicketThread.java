package com.yzl.work2;

public class TicketThread implements Runnable{

	public static int num = 10;

	@Override
	public void run() {
		while(true) {
			synchronized (this) 
			{
				num--;
				/*
				 * try { Thread.sleep(1); } catch (InterruptedException e) {
				 * e.printStackTrace(); }
				 */
				
				if(num >= 0)
					System.out.println(Thread.currentThread().getName()+"������һ��Ʊ����ʣ"+num+"��Ʊ��");
				else
					break;
				
				
				 if(Thread.currentThread().getName().equals("������"));
				 Thread.currentThread().interrupt();
				 
			}
		}
	}

}
