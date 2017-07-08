package com.lbs.algorithms;

import java.util.Arrays;

public class HeapSort {
	
	private int capacity = 10;
	private int size = 0;
	
	int[] items = new int[capacity];
	
	private int getLeftChildIndex(int parentIndex){ return 2 * parentIndex + 1; }
	private int getRightChildIndex(int parentIndex){ return 2 * parentIndex + 2; }
	private int getparentIndex(int childIndex){ return (int) Math.ceil( ((double)childIndex - 2)/2 ); }
	
	private boolean hasLeftChild(int index){ return getLeftChildIndex(index) < size; }
	private boolean hasRightChild(int index){ return getRightChildIndex(index) < size; }
	private boolean hasParent(int index){ return getparentIndex(index) >= 0; }
	
	private int leftChild(int index){ return items[getLeftChildIndex(index)];}
	private int rightChild(int index){ return items[getRightChildIndex(index)]; }
	private int parent(int index){ return items[getparentIndex(index)]; }
	
	private void swap(int indexOne, int indexTwo){
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}
	
	private void ensureCapacity(){
		if(size == capacity){
			items = Arrays.copyOf(items, capacity*2);
			capacity *= 2;
		}
	}
	
	public int peek(){
		if(size == 0) throw new IllegalStateException();
		return items[0];
	}
	
	public int poll(){
		if(size == 0) throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size-1];
		heapifyDown();
		return item;
	}
	
	public void add(int item){
		ensureCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}
	
	public void heapifyUp(){
		int index = size-1;
		while( hasParent(index) && parent(index) > items[index] ){
			swap(getparentIndex(index), index);
			index = getparentIndex(index);
		}
	}
	
	public void heapifyDown(){
		int index = 0;
		while(hasLeftChild(index)){
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index) < leftChild(index)){
				smallerChildIndex = getRightChildIndex(index);
			}
			if(items[index] < items[smallerChildIndex]){
				break;
			} else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}
	
	public void display(){
		StringBuffer output = new StringBuffer();
		output.append("[ ");
		while(size >0){
			output.append(poll()+" ");
			size--;
		}
		output.append("]");
		System.out.println(output.toString());
	}
	
}
