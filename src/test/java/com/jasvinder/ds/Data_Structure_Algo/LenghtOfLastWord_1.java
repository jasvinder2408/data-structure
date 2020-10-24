package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class LenghtOfLastWord_1 {

	// Approach
	// 1. Reverse the string and find the length of 1 word
	// 2. Start iterating from end of string and stop when space encounter.
	// 3. Using count variable

	
	private static int lengthOfLastWordUsingCount(String str) {
		int count = 0;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count += 1;
				result = count;
			}
			if ((str.charAt(i) == ' ')) {
				count = 0;
			}
		}
		return result;

	}
	@Test
	public void test_lengthOfLastWord() {
		
		assertEquals(0, lengthOfLastWordUsingCount(""));
		assertEquals(5, lengthOfLastWordUsingCount("hello world"));
		


	}

	
}
