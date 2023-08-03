package com.week3homework;

import org.junit.Test;

public class SecondLargestDigitInAStringLeetCode1796 {
	
	//https://leetcode.com/problems/second-largest-digit-in-a-string/description/
	
	
	@Test
	public void test() {
		System.out.println(secondHighest("dfa12321afd"));
	}
	
	
	public int secondHighest(String s) {
		int firstLargest=-1;
		int secondLargest=-1;
		//String onlyDigit=s.replaceAll("[a-z]", "");
		for (int i = 0; i < s.length(); i++) {
		    int k=s.charAt(i)-'0';
		    System.out.println("K value is :" + k);
		    
            if(k<10){
            	
                if(k>firstLargest){
                	secondLargest=firstLargest;
                    firstLargest=k;
                } else if(k!=firstLargest  && k>secondLargest)
                	secondLargest=k;
            }
        }
				
		return secondLargest;
		
	}

}
