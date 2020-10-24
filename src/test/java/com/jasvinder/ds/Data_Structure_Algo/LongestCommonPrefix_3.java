package com.jasvinder.ds.Data_Structure_Algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefix_3 {	
	
	
	// Better approach
	 public String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		    	while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}
	 
	 
	 public String longestCommonPrefixPart2(String[] strs) {
		    if(strs.length == 0) return "";
		    
		    StringBuilder cmn = new StringBuilder(strs[0]);
		    for(int i=1;i<strs.length;i++){
		        int j = 0, k = 0;
		        while(j<strs[i].length() && k<cmn.length() && strs[i].charAt(j) == cmn.charAt(k)){
		            j++;
		            k++;
		        }
		        cmn = new StringBuilder(cmn.substring(0, k));
		        if(cmn.length()==0) return "";
		    }
		    return cmn.toString();
		}
	 
	 
	 @Test
	 public void test_longestCommonPrefix() {
		 String [] str1= {"flower","flow","flight"};
		 String [] str2= {"dog","dig","gun"};
		// assertEquals("fl",longestCommonPrefix(str1));
		// assertEquals("",longestCommonPrefix(str2));
		 assertEquals("fl",longestCommonPrefixPart2(str1));

		 

	 }
}
