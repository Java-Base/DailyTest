package com.momai.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出两个数组中不同的元素, 并存放的新的数组中打印出来
 * find different elements in array A and B
 * 
 * @author 	Lian
 * @date	2016年4月11日
 * @since	1.0
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[] aryA = { 1, 3, 5, 7, 9, 11, 13 };// 要比较的数组aryA
		int[] aryB = { 2, 4, 6, 8, 10, 5, 7, 9 };// 要比较的数组aryB

		List<Integer> list = new ArrayList<Integer>();// 不知道有多少不同元素，因此用List

		for (int i = 0; i < aryB.length; i++) {
			boolean isExistInAryA = false;
			for (int j = 0; j < aryA.length; j++) {
				if (aryA[j] == aryB[i]) {
					isExistInAryA = true;
					break;
				}
			}

			if (!isExistInAryA) {
				list.add(aryB[i]);
			}
		}

		int[] aryC = new int[list.size()];// 存放不同元素的数组C

		for (int i = 0; i < list.size(); i++) {
			aryC[i] = list.get(i).intValue();
		}

		System.out.println("Different elment in array A and B are: ");
		for (int value : aryC) {// 打印输出数组中的不同元素
			System.out.print(value + "  ");
		}
	}
}
