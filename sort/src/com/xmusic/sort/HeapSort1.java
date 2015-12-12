package com.xmusic.sort;

/**
 * �ѵĶ���<br/>
 * <li>n���ؼ�������K1��K2������Kn�����ҽ���������������������ʱ����Ϊ��</li>
 * <li>�󶥶ѣ����򣩣�k[i]>k[2i] �� k[i]>k[2i+1]</li>
 * <li>С���ѣ����򣩣�k[i]<k[2i] �� k[i]<k[2i+1]</li><br/>
 * 
 * ������ԭ��<br/>
 * <li>�������ԭ���Ǵ����һ����Ҷ�ӽڵ㿪ʼ������ڵ㡢�ҽڵ�(�������)���бȽϣ�������Ԫ����ѡ�������Ԫ�أ��������ڵ���</li>
 * <li>�����һ����Ҷ�ӽڵ�������ǰѭ����һ�����������ᱣ֤���(С)��Ԫ�ر������������ĸ��ڵ�</li>
 * <li>�����ڵ��Ԫ���������������е����һ��Ԫ�ؽ��н���</li>
 * <li>����ѭ����ֱ���������б��������</li>
 * 
 * @author qiuqiu3212
 */
public class HeapSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// ������
		for (int i = 0; i < a.length - 1; i++) {
			heapSort(a, a.length - 1 - i);
		}
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * ������<br/>
	 * <li>����󶥶�</li>
	 * <li>��������Ԫ�������Ԫ�ص�ֵ</li>
	 * 
	 * @param a
	 *            ��Ҫ���������
	 * @param lastIndex
	 *            ��������������Ԫ�ص��±�
	 */
	private static void heapSort(int[] a, int lastIndex) {

		// ����󶥶�
		for (int i = ((lastIndex - 1) / 2); i >= 0; i--) {
			int bigger = i * 2 + 1;
			if (bigger < lastIndex) {
				if (a[bigger] < a[bigger + 1]) {
					bigger++;
				}
			}
			if (a[i] < a[bigger]) {
				int temp = a[i];
				a[i] = a[bigger];
				a[bigger] = temp;
			}
		}

		// ��������Ԫ�������Ԫ�ص�ֵ
		int temp = a[0];
		a[0] = a[lastIndex];
		a[lastIndex] = temp;
	}
}
