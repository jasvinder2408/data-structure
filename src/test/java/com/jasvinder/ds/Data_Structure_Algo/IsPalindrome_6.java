package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class IsPalindrome_6 {

	public boolean isPalindrome(String s) {

		if (s.isEmpty())
			return true;

		s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int len = s.length();

		for (int i = 0, j = len - 1; i <= len / 2 && j > i; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}

		return true;

	}

	@Test
	public void test_IsPalindrome() {
		assertEquals(true, isPalindrome("aBa"));

		assertEquals(false, isPalindrome("race a car"));
		assertEquals(true, isPalindrome("A man, a plan, a canal: Panama"));

	}

//	public boolean isPalindromeWithStack(String s) {
//		s = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
//		Stack<Character> st = new Stack<Character>();
//		for (int i = 0; i < s.length(); i++)
//			st.add(s.charAt(i));
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != st.pop())
//				return false;
//		}
//		return true;
//	}
	
	
	
	 
}
