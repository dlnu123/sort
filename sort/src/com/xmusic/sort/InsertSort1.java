package com.xmusic.sort;

public class InsertSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// ��������
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			for (j = i; j > 0 && temp < a[j - 1]; j--) {
				a[j] = a[j - 1]; // �����ڵ�ǰֵ����ֵ�����ƶ�һλ
			}
			a[j] = temp; // ����ǰֵ�����������ʵλ��
		}
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
