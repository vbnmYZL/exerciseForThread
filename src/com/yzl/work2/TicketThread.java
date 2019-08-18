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
					System.out.println(Thread.currentThread().getName()+"抢到了一张票，还剩"+num+"张票。");
				else
					break;
				
				
				 if(Thread.currentThread().getName().equals("桃跑跑"));
				 Thread.currentThread().interrupt();
				 
			}
		}
	}

}
