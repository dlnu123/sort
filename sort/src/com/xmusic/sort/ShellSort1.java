package com.xmusic.sort;

public class ShellSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// ϣ������
		shellSort(a);
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void shellSort(int[] a) {
		// i���ּ��顢����
		for (int i = a.length / 2; i > 0; i /= 2) {
			// j���������׸�Ԫ�ص��±꣬Ӧ��С�ڲ���(������)
			for (int j = 0; j < i; j++) {
				// m��ÿ���еĵڶ�Ԫ�ص��±�λ�ã�������ǰ������õ�Ԫ�ؽ��бȽϣ��ҵ������λ��
				for (int m = j + i; m < a.length; m += i) {
					int temp = a[m]; // temp����¼��ǰ��Ҫ�Ƚϵ�Ԫ�ص�ֵ
					int n = m; // n����¼��ǰ��Ҫ�Ƚϵ�Ԫ�صĳ���λ��
					// n���ڱ�֤���ڵ�ǰ����׸�Ԫ�ص��±�ֵ��ǰ���£��Ƚ�temp��ǰһ��Ԫ�ص�ֵ�Ĵ�С
					// ���С��ǰһ��Ԫ�أ���ǰһ��Ԫ�غ���
					// ������ڵ���ǰһ��Ԫ�أ�������ѭ��������ǰnָ����λ�ø�ֵΪtemp
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
