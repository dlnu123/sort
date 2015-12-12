package com.xmusic.sort;

public class InsertSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// 插入排序
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			for (j = i; j > 0 && temp < a[j - 1]; j--) {
				a[j] = a[j - 1]; // 将大于当前值得数值往后移动一位
			}
			a[j] = temp; // 将当前值插入排序的真实位置
		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
