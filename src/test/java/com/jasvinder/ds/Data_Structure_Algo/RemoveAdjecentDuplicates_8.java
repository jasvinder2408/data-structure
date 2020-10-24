package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class RemoveAdjecentDuplicates_8 {

	
	public String removeDuplicatesWithStack(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)) {
            	System.out.println(stack);  
            	System.out.println(S.charAt(i));                

                stack.pop();
            }
            	
            else {
            	System.out.println(S.charAt(i));  
            	
            	 stack.push(S.charAt(i));
            }
               
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) 
            sb.append(c);
        return sb.toString();
    }
	 public String removeDuplicatesWith2Pointers(String S) {
	        char[] ch = S.toCharArray();
	        int len = S.length(), p = 0; // p as a pointer, to point the next index of current substring.
	        for (int i=0; i<len; i++) {
	            if (p == 0 || ch[i] != ch[p-1]) {
	                ch[p++] = ch[i];
	            } else {
	                p--;
	            }
	        }
	        return String.valueOf(ch).substring(0, p);
	    }
	 
	 
	 @Test
	    public void test_adjacentDuplicates() {
			assertEquals("ca", removeDuplicatesWithStack("abbaca"));
			assertEquals("ca", removeDuplicatesWith2Pointers("abbaca"));

	 }
}
