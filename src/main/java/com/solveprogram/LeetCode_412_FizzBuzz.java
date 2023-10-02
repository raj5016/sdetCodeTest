package com.solveprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_412_FizzBuzz {

	/*
	 * Given an integer n, return a string array answer (1-indexed) where:
	 * 
	 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
	 * answer[i] == "Fizz" if i is divisible by 3. 
	 * answer[i] == "Buzz" if i is divisible by 5. 
	 * answer[i] == i (as a string) if none of the above conditions are true.
	 */
	
			//Input: n = 5
			//Output: ["1","2","Fizz","4","Buzz"]
	
	//create list 
	// User for loop to iterate until the input
	//add condition 
	@Test
	public void test1() {
		System.out.println(fizzbuzz(15));
		List<String> expected=Arrays.asList(new String[] {"1","2","Fizz"});
		Assert.assertEquals(expected, fizzbuzz(3));
	}
	
	public List<String> fizzbuzz(int n) {
		List<String> output=new ArrayList<String>();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				output.add("FizzBuzz");
			}else if(i%3==0) {
				output.add("Fizz");
			}else if(i%5==0) {
				output.add("Buzz");
			}else {
				output.add(Integer.toString(i));
			}		
	}
		return output;
	}	
	
}
