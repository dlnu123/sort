package com.xmusic.sort;

public class QuickSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// ��������
		if (a.length > 0) {
			quickSort(a, 0, a.length - 1);
		}
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		int base = a[low];
		int start = low;
		int end = high;
		while (low < high) { // ѭ����Ҫ��������飬ֱ��low��high����ֵ��ȣ����Ƚ�����Ƚ���ϣ�
			while (low < high && a[high] >= base) {
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= base) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = base; // ������ѡΪ��׼�����ַ�������λ�ã���λ�ü�Ϊ�û�׼���������ź���ʱ���ڵ�λ��
		// �ڵݹ���õ�ʱ����Ҫ������ѡ��Ϊ��׼�������ڵ�λ���ٳ����´αȽ�֮��
		if (start < low) {
			quickSort(a, start, low - 1);
		}
		if (end > low) {
			quickSort(a, low + 1, end);
		}
	}
}
