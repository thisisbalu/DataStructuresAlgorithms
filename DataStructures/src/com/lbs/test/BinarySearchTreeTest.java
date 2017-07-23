package com.lbs.test;

import com.lbs.trees.BinarySearchTree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(40);
		bst.insert(10);
		bst.insert(41);
		bst.insert(1);
		bst.insert(50);
		bst.insert(13);
		bst.insert(0);
		bst.insert(7);
		bst.insert(91);
		bst.insert(100);
		bst.insert(99);
		bst.insert(81);
		bst.insert(41);
		
		bst.printInOrder();
		System.out.println();
		bst.printPreOrder();
		System.out.println();
		bst.printPostOrder();
		System.out.println();
		
		BinarySearchTree tree = new BinarySearchTree(40);
		tree.left = new BinarySearchTree(20);
		tree.right = new BinarySearchTree(50);
		tree.left.left = new BinarySearchTree(15);
		tree.left.right = new BinarySearchTree(21);
		tree.right.left = new BinarySearchTree(45);
		tree.right.right = new BinarySearchTree(55);
		
		System.out.println(tree.isBST(tree));
		

	}

}
