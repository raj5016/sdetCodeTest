package com.solveprogram;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class LeetCode_268_MissingNumberInArray {
	
		//https://leetcode.com/problems/missing-number/description/
	/** 1) Did I understand the problem?  
			 * 		-> If yes, go to next step !!
			 * 
			 *    What is the input(s)? String
			 *    What is the expected output? boolean
			 *    Do I have constraints to solve the problem?
			 *    Do I have all informations to go to next step!!
			 *    // How big is your test data set will be?
			 *    
			 * 2) Test data set
			 *  	
			 *  	Minimum of 3 data set !! Positive, Edge, Negative 
			 *      Validate with the interviewer if the data set is fine by his/her assumptions
			 * 
			 * 3) Do I know how to solve it?
			 * 		
			 * 		Yes - great, // is there an alternate?
			 * 
			 * 4) Ask for hint (If you do not know how to solve)
			 *  
			 * 5) // Do I know alternate solutions as well? No
			 * 
			 * 		No - That is still fine, proceed to solve by what you know !!
			 * 
			 * 6) // If you know alternate solutions -> find out the O Notations (Performance)
			 * 
			 * 		Then, explain either both or the best (depends on the time)
			 * 
			 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
			 * 		Approach 2: Write down the options and benefits and code the best 
			 * 
			 * 7) Start always with Psuedo code 
			 * 
			 * 8) Implement them in the code (editor)
			 * 
			 * 9) Test against the different data set 
			 * 
			 * 10) If it fails, debug them to solve it !!
			 * */
			 

	
	/*Input-integer array
	 * Output-integer
	 * Sort the Array
	 * Traverse through the array
	 * if the index and corresponding value does't match 
	 * 		then return index
	 * return length of array
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(2, returnMissingNum(new int[] {3,0,1}));
	}
	
	public int returnMissingNum(int[] n) {
		Arrays.sort(n);
		for(int i=0;i<n.length;i++) {
			if(n[i]!=i) {
				return i;
			}
		}
		return n.length;
		
	}
	
	
}
