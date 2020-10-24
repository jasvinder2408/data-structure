package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElement_4 {
	
	// T=O(n)
	// S=O(1)
	// using morre votting approach
	private int majorityElement(int[] array) {
		int count=1;
		int len=array.length;
		int majEle=array[0];
		for(int i=1; i< len; i++) {
			
			
			if(majEle ==array[i]) {
				count++;
			}
			else {
				count--;
				if(count ==0) {
					majEle=array[i];
					count=1;
				}
			}
			
			 
		}
		
		int count2=0;
		for(int i=0; i<len;i++) {
			if(array[i]==majEle) {
				count2++;
			}
		}
		if(count2> len/2 )
			return majEle;
		else return -1;
		
	}
	@Test
	public void test_majorityElement() {
		assertEquals(5,majorityElement(new int [] {5,4,1,5,4,5,2,5}));
		//assertEquals(4,majorityElement(new int [] {4,3,4,3,3,4,4,4,3,3}));
		//assertEquals(-1,majorityElement(new int [] {4,3,4,3,3,4,4,4,3,3}));


	}

}
