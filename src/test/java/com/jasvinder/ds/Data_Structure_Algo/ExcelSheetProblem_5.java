package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExcelSheetProblem_5 {

	
	public static int titleToNumber(String s) {
        int res = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			int val = s.charAt(i) - 65 + 1;
			res = res + val * (int) Math.pow(26, n - i - 1);
		}

		return res;
    }
	@Test
	public void test_titleToNumber() {
		assertEquals(1,titleToNumber("A"));
		assertEquals(28,titleToNumber("AB"));
		assertEquals(701,titleToNumber("ZY"));		
	}
}
