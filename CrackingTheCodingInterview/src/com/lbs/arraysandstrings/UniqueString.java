package com.lbs.arraysandstrings;

public class UniqueString {
	
	// Time Complexity - o(n)
	// Space Complexity - o(1)

	public static void main(String[] args) {
		System.out.println(isUnique("qwertyukdmcvn"));
		System.out.println(isUnique("balasubramanyamlanka"));
		System.out.println(isUnique("balu"));
		System.out.println(isUnique("subramanyam"));
		System.out.println(isUnique("lanka"));
		System.out.println(isUnique("qwertyuiopasdfghjklzxcvbnm"));
		System.out.println(isUnique("123456789"));
		System.out.println(isUnique("qwertyukdmcvn"));
		System.out.println(isUnique("qwertyukdmcvn"));

	}
	
	public static boolean isUnique(String str){
		boolean[] characters = new boolean[256];
		if(str.length() > 256) return false;
		for(int i = 0; i<str.length(); i++){
			if(characters[str.charAt(i)]){
				return false;
			}
			characters[str.charAt(i)] = true;
		}
		return true;
	}
}
