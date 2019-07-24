package com.jjx.study;
public class BubbleSort 
{
    public static void main( String[] args )
    {
    	bubbleSort();
    }
    
    /**
     * 1、嵌套两层循环，一层从i开始，二层从i+1开始
     * 2、左边的数和右边的数逐个比较
     * 3、左边的数大于右边的交换
     */
    public static  void bubbleSort() {
    	int[] arr= {9,3,2,4,7,8};
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = i+1; j < arr.length; j++) {
    			if (arr[i]>arr[j]) {
    				int leftvalue = arr[j];
    				arr[j]=arr[i];
    				arr[i]=leftvalue;
    			}
    		}
    	}
    	for(int i: arr) {
    		System.out.println(i);
    	}
	}
    
}