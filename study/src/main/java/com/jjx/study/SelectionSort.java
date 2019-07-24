package com.jjx.study;

/**
 * 选择排序
 * 
 * @author jiangjinxin
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 9, 3, 2, 4, 7, 8 };
		selectionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void selectionSort(int[] arr) {
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

	}
}
