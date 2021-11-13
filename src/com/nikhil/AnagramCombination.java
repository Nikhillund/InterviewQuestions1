package com.nikhil;

import java.util.Arrays;
import java.util.Properties;

public class AnagramCombination {
//	
//	Common Anagrams
//    Input- {"cat", "dog", "tac", "god", "act"}
//    Output - [[cat,tac,act], [dog,god]]

	public static void anag(String[] s) {
		
		Properties p = new Properties();
		int k=0;
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=i+1;j<s.length-1;j++) {
				
				
				if(isAnagram(s[i],s[j])) {
					
					p.put(k, s[i]);
					p.put(k, s[j]);
					k++;
				}
				
			}
			
		}
		
		System.out.println(p.toString());
		
	}
	

	private static boolean isAnagram(String string, String string2) {
	if(string.length()!=string2.length()) {
		return false;
	}
	
	if(string.isEmpty() || string2.isEmpty()) {
		return false;
	}
	
	char[] c =string.toCharArray();
	char[] c1 =string2.toCharArray();
	Arrays.sort(c);
	Arrays.sort(c1);
	
//	if(c.) {
//		return true;
//	}
	return false;
}


	public static void main(String[] args) {
		String[] s = {"cat", "dog", "tac", "god", "act"};
anag(s);
	}

}
