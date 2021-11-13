package com.nikhil;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortedParagraph extends AbstractComparatorSort {
	
	public static void sort(String s) {
		String s1[]=s.split(" ");
		
		Map<String, Integer> hm =new HashMap<String, Integer>();
		
		for(String s2 : s1) {
			if(hm.containsKey(s2)) {
				hm.put(s2, hm.get(s2)+1);
			}
			else {
				hm.put(s2, 1);
			}
		}
		
//		Collections.sort(hm.entrySet(), new SortedParagraph().compare(hm.values(), hm.values()) );
		
		
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1.intValue()<o2.intValue()) {
			return 1;
		}
		else if(o1.intValue()<o2.intValue())
		return -1;
		
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
