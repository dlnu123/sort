package com.xmusic.sort;

public class SelectSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// ѡ������
		selectSort(a);
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i; // ��¼��Сֵ��λ��
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) { // �����Сֵλ�ñ仯��������ǰδ����������׸�Ԫ������Сֵ
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
}
