package com.xmusic.sort;

/**
 * 1�����αȽ����ڵ�����Ԫ�أ������һ���ȵڶ��������򣩣��򽻻�����Ԫ�ص�λ�ã�����ѭ��һ�Σ����һ��Ԫ��Ϊ����Ԫ�أ�
 * 2�����������ʣ�µ�Ԫ�ؽ�������Ĳ���������ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϣ�
 * 3�����ڶ���ѭ��������ʱ���ж���Ĵ���һ�ζ�û��ִ�й���˵�������Ѿ���ɡ�
 * 
 * @author qiuqiu3212
 */
public class BubbleSort2 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// ð������
		boolean flag;
		for (int i = 0; i < a.length - 1; i++) {
			flag = true;
			for (int j = 0; j < a.length - i - 1; j++) {
				// ����-i��Ҫ��ÿ����һ�ζ�������i�������������ȥ�ˣ�û�б�Ҫ���滻��
				// ��������(��С��������Ӵ�С��ֻ�轫���ںŻ���С�ں�)
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
