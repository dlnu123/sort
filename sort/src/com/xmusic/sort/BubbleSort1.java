package com.xmusic.sort;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("����֮ǰ��");
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();

		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				// ��������(��С��������Ӵ�С��ֻ�轫���ںŻ���С�ں�)
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("����֮��");
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
