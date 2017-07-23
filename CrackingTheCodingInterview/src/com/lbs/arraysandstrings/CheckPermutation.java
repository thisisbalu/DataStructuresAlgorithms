package com.lbs.arraysandstrings;

public class CheckPermutation {
	
	/*
	 * Check Permutation: Given two strings, 
	 * write a method to decide if one is a permutation of the other.
	 */

	public static void main(String[] args) {
		System.out.println(checkPermutation("abcab", "aabbc"));
		System.out.println(checkPermutation("aaaa", "aaaa"));

	}
	
	public static boolean checkPermutation(String str1, String str2){
		if(str1.length() != str2.length()) return false;
		int[] letters = new int[128];
		
		for(int i=0; i<str1.length(); i++){
			int c = str1.charAt(i);
			letters[c]++;
		}
		
		for(int i=0; i<str2.length(); i++){
			int c = str2.charAt(i);
			letters[c]--;
			if(letters[c] < 0){
				return false;
			}
		}
		return true;
	}

}
