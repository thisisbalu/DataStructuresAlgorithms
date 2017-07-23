package com.lbs.trees;

public class BinarySearchTree {
	
	public BinarySearchTree left, right;
	Integer data = null;
	
	public BinarySearchTree(int value) {
		data = new Integer(value);
	}
	
	public BinarySearchTree(){
		
	}
	
	public void insert(int value){
		if(data == null){
			data = new Integer(value);
		} else {
			if(value <= data){
				if(left == null){
					left = new BinarySearchTree(value);
				} else {
					left.insert(value);
				}
			} else {
				if(right == null){
					right = new BinarySearchTree(value);
				} else {
					right.insert(value);
				}
			}
		}
	}
	
	public boolean contains(int value){
		if( data == value) return true;
		else if(value < data){
			if(left == null) return false;
			else left.contains(value);
		} else {
			if(right == null) return false;
			else right.contains(value);
		}
		return false;
	}
	
	public void printInOrder(){
		if(left != null){
			left.printInOrder();
		}
		System.out.print(data+" ");
		if(right != null){
			right.printInOrder();
		}
			
	}
	
	public void printPreOrder(){
		System.out.print(data+" ");
		if(left != null){
			left.printPreOrder();
		}
		if(right != null){
			right.printPreOrder();
		}
			
	}
	
	public void printPostOrder(){
		if(left != null){
			left.printPostOrder();
		}
		if(right != null){
			right.printPostOrder();
		}
		System.out.print(data+" ");
	}
	
	public boolean isBST(BinarySearchTree tree){
		return checkBST(tree, null, null);
	}
	
	public boolean checkBST(BinarySearchTree node, Integer MIN, Integer MAX){
		if(node == null) return true;
		
		if( (MIN != null && node.data <= MIN) || (MAX != null && node.data>MAX) ){
			return false;
		}
		
		if( !checkBST(node.left, MIN, node.data) || !checkBST(node.right, node.data, MAX) ){
			return false;
		}
		return true;
	}
}
