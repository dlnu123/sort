package com.xmusic.sort;

public class QuickSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 快速排序
		if (a.length > 0) {
			quickSort(a, 0, a.length - 1);
		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		int base = a[low];
		int start = low;
		int end = high;
		while (low < high) { // 循环需要排序的数组，直到low和high的数值相等（即比较数组比较完毕）
			while (low < high && a[high] >= base) {
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= base) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = base; // 将本次选为基准的数字放在中心位置，本位置即为该基准数字最终排好序时所在的位置
		// 在递归调用的时候，需要将本次选择为基准的数所在的位置刨除在下次比较之列
		if (start < low) {
			quickSort(a, start, low - 1);
		}
		if (end > low) {
			quickSort(a, low + 1, end);
		}
	}
}
