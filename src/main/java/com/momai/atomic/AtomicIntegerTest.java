package com.momai.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger
 *
 * @author Lian
 * @date 2017/1/12
 * @since 1.0
 */
public class AtomicIntegerTest {

	public static void main(String[] args) {
		AtomicInteger at = new AtomicInteger();
		System.out.println(at);
		System.out.println(at.get());
		System.out.println(at.incrementAndGet());
	}
}
