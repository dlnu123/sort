package com.xmusic.sort;

public class ShellSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// 希尔排序
		shellSort(a);
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void shellSort(int[] a) {
		// i：分几组、步长
		for (int i = a.length / 2; i > 0; i /= 2) {
			// j：分组中首个元素的下标，应该小于步长(分组数)
			for (int j = 0; j < i; j++) {
				// m：每组中的第二元素的下标位置，依次与前面排序好的元素进行比较，找到插入的位置
				for (int m = j + i; m < a.length; m += i) {
					int temp = a[m]; // temp：记录当前需要比较的元素的值
					int n = m; // n：记录当前需要比较的元素的初试位置
					// n：在保证大于当前组的首个元素的下标值的前提下，比较temp与前一个元素的值的大小
					// 如果小于前一个元素，则将前一个元素后移
					// 如果大于等于前一个元素，则跳出循环，将当前n指定的位置赋值为temp
					while (n > j && a[n - i] > temp) {
						a[n] = a[n - i];
						n -= i;
					}
					a[n] = temp;
				}
			}
		}
	}
}
