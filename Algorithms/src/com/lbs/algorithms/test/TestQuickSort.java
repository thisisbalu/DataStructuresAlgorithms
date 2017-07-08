package com.lbs.algorithms.test;

import com.lbs.algorithms.QuickSort;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] array = {15,3,9,8,5,2,44,33,77,22,545,2,3,4,5,3,3,3,2,3,4,5,67,35,34,3,1,2,3,78,7,878,78,78,34,7,1,6};
		long startTime = System.nanoTime(); 
		QuickSort quickSort = new QuickSort(array, 0, array.length-1);
		long duration = System.nanoTime() - startTime; 
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("Time:"+duration);

	}

}
