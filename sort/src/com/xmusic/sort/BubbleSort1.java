package com.xmusic.sort;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();

		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				// 升序排序(从小到大，如果从大到小，只需将大于号换成小于号)
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("排序之后：");
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
