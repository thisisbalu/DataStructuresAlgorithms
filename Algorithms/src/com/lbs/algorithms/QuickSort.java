package com.lbs.algorithms;

public class QuickSort {
	
	public QuickSort(int[] array, int left, int right){
		quickSort(array, left, right);
	}
	
	public void quickSort(int[] array, int left, int right){
		if(left >= right){
			return;
		}
		int pivot = array[(left+right)/2];
		int index = partition(array, left, right, pivot);
		quickSort(array, left, index-1);
		quickSort(array, index, right);
	}
	
	public int partition(int[] array, int left, int right, int pivot){
		while(left <= right){
			while(array[left] < pivot){
				left++;
			}
			while(array[right] > pivot){
				right--;
			}
			if(left <= right){
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public void swap(int[] array, int left, int right){
		int temp = array[right];
		array[right] = array[left];
		array[left] = temp;
	}
}
