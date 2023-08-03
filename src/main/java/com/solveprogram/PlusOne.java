package com.solveprogram;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PlusOne {
	
	//66.https://leetcode.com/problems/plus-one/description/
	
	@Test
	public void test() {
		System.out.println(onePlus(new int[] {1,2,3}));
	}
	
    public int[] onePlus(int[] input) {
    	for(int i=input.length-1;i>=0;i--) {
    		 if(input[i] <9) {
    			 input[i]=input[i]+1;
    			 return input;
    		 }
    		 input[i]=0;
    	}
    	int[] output=new int[input.length+1];
    	output[0]=1;
    	return output;
    	
    }
}
