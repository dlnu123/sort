package com.xmusic.sort;

/**
 * 1、依次比较相邻的两个元素，如果第一个比第二个大（升序），则交换两个元素的位置，这样循环一次，最后一个元素为最大的元素；
 * 2、再针对所有剩下的元素进行上面的操作，持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较；
 * 3、当第二层循环结束的时候，判断体的代码一次都没有执行过，说明排序已经完成。
 * 
 * @author qiuqiu3212
 */
public class BubbleSort2 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 冒泡排序
		boolean flag;
		for (int i = 0; i < a.length - 1; i++) {
			flag = true;
			for (int j = 0; j < a.length - i - 1; j++) {
				// 这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
				// 升序排序(从小到大，如果从大到小，只需将大于号换成小于号)
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
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
