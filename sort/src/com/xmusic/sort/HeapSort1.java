package com.xmusic.sort;

/**
 * 堆的定义<br/>
 * <li>n个关键字序列K1，K2，…，Kn，当且仅当该序列满足如下性质时，称为堆</li>
 * <li>大顶堆（升序）：k[i]>k[2i] 且 k[i]>k[2i+1]</li>
 * <li>小顶堆（降序）：k[i]<k[2i] 且 k[i]<k[2i+1]</li><br/>
 * 
 * 堆排序原理<br/>
 * <li>堆排序的原理是从最后一个非叶子节点开始，与左节点、右节点(如果存在)进行比较，在三个元素中选择出最大的元素，换到父节点上</li>
 * <li>从最后一个非叶子节点依次向前循环第一步操作，最后会保证最大(小)的元素被换到整棵树的根节点</li>
 * <li>将根节点的元素与待排序的序列中的最后一个元素进行交换</li>
 * <li>依次循环，直到整个序列被排序完成</li>
 * 
 * @author qiuqiu3212
 */
public class HeapSort1 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// 堆排序
		for (int i = 0; i < a.length - 1; i++) {
			heapSort(a, a.length - 1 - i);
		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * 堆排序<br/>
	 * <li>构造大顶堆</li>
	 * <li>交换顶部元素与最后元素的值</li>
	 * 
	 * @param a
	 *            需要排序的数组
	 * @param lastIndex
	 *            待排序数组的最后元素的下标
	 */
	private static void heapSort(int[] a, int lastIndex) {

		// 构造大顶堆
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

		// 交换顶部元素与最后元素的值
		int temp = a[0];
		a[0] = a[lastIndex];
		a[lastIndex] = temp;
	}
}
