package com.momai.thread;

/**
 * 继承Thread类覆盖run方法
 * 
 * @author 	Lian
 * @date	2016年4月20日
 * @since	1.0	
 */
public class ThreadDomo1 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		for (int i = 0; i < 60; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

}

class Demo extends Thread {
	public void run() {
		for (int i = 0; i < 60; i++)
			System.out.println(Thread.currentThread().getName() + i);
	}
}