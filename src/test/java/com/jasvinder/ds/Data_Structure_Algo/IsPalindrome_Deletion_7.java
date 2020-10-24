package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsPalindrome_Deletion_7 {

	
	private boolean check(String A,int start,int end){
        while(start<=end){
            if(A.charAt(start)!= A.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    private boolean validPalindrome(String A) {
        int start=0;
        int end = A.length()-1;
        
        while(start<=end){
            if(A.charAt(start) != A.charAt(end)){
                /// 2 cases
                /// delete s  check for A[s+1...e]
                /// delete e check for A[s...e-1]
                if(check(A,start+1,end) || check(A,start,end-1)){
                    return true;
                } else {
                    /// after deleting 1 char we are unable to obtain a palin
                    return false;
                }
                
            }
            start++;
            end--;
        }
        
        /// string is already palin
        return true;
    }
    
    @Test
    public void test_palindrome() {
		assertEquals(true, validPalindrome("aba"));
		assertEquals(true, validPalindrome("abca"));
		assertEquals(true, validPalindrome("abcbfa"));
		assertEquals(false, validPalindrome("abscbfa"));




    }
}
