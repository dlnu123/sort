package com.xmusic.sort;

public class SelectSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// 选择排序
		selectSort(a);
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i; // 记录最小值的位置
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) { // 如果最小值位置变化，交换当前未排序数组的首个元素与最小值
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
}
