package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseString_2 {

	public char[] reverseStringWithSwap(char[] s) {
		Character temp=null;
		int len = s.length;
		for (int i = 0; i < len / 2; i++) {
			temp = s[i];
			s[i] = s[len - 1 - i];
			s[len - 1 - i] = temp;
		}
		return s;
	}
	
	@Test
	public void test_reverseStringWithSwap() {
		char [] s= {'h','e','l', 'l'};
		System.out.println( reverseStringWithSwap(s));
		//assertEquals("",);
	}
	
	 public char[] reverseStringUsing2Pointers(char[] s) {
	        int left = 0, right = s.length - 1;
	        while (left < right) {
	            char tmp = s[left];
	            s[left++] = s[right];
	            s[right--] = tmp;
	        }
	        return s;
	    }

	@Test
	public void test_reverseStringUsing2Pointers() {
		char [] s= {'h','e','l'};
		System.out.println(reverseStringUsing2Pointers(s));
	}
	 
}
