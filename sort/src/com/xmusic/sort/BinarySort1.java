package com.xmusic.sort;

public class BinarySort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1, 18, 176, 49 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// ���ַ���������
		binarySort(a);
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void binarySort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int left = 0; // ���������е���ʼλ��
			int right = i - 1; // ���������е����λ��
			// �������ң�ֱ����ָ�������ָ��ʱֹͣ����ʱ�õ�����ָ����ʵ����Ԫ��Ҫ�����λ��
			// ΪɶҪ�е��ڣ�
			// �����������ǣ���Ϊ�±�Ϊ 1 ��Ԫ�ز��Ҳ���λ�õ�ʱ�����û�С����ڡ����൱��û�н�������
			// ��Ϊȡ��right��ֵ��ʱ������˼�һ����
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
