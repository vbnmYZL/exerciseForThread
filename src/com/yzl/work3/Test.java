package com.yzl.work3;

public class Test {

	public static void main(String[] args) {

		ShareData s = new ShareData();
		new Consumer(s).start();
		new Producer(s).start();
	}

}
