package com.nikhil;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Main {
	
	static void getEncodedString(String input) {
		int count=1;
		ArrayList result;
		
		for(int i=0;i<input.length();i++) {
			
			
				while(input.charAt(i)==input.charAt(i+1)  ) {
					if(i+2>=input.charAt(i)) break;
					i++;
					count++;
					
				}
				System.out.print(input.charAt(i)+""+count);
				count=1;
				
			
			}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getEncodedString("wwwwaaadexxxxxxww");
		

	}
//	Problem 1: Given an input string, write a function that returns the Run Length Encoded string for the input string.
//	For example, 
//	if the input string is “wwwwaaadexxxxxxww”, 
//	then the function should
//	return “w4a3d1e1x6w2”

}
