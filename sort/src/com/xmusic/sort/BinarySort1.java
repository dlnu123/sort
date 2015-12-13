package com.xmusic.sort;

public class BinarySort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1, 18, 176, 49 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// 二分法插入排序
		binarySort(a);
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void binarySort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int left = 0; // 已排序序列的起始位置
			int right = i - 1; // 已排序序列的最后位置
			// 反复查找，直到左指针大于右指针时停止，此时得到的左指针其实就是元素要插入的位置
			// 为啥要有等于？
			// 可以这样考虑，当为下标为 1 的元素查找插入位置的时候，如果没有“等于”，相当于没有进行排序
			// 因为取得right的值的时候进行了减一操作
			while (left <= right) {
				int mid = (left + right) / 2;
				if (a[mid] > temp) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			for (int j = i; j > left; j--) {
				a[j] = a[j - 1];
			}
			a[left] = temp;
		}
	}
}
