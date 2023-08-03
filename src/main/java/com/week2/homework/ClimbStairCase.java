package com.week2.homework;

import org.junit.Assert;
import org.junit.Test;

public class ClimbStairCase {

	/*
	 * https://leetcode.com/problems/climbing-stairs/solutions/  (Asked in adobe)
	 * 
	 * Reference video -https://www.youtube.com/watch?v=cGTFd5MbJ_4
	 * 
	 * You are climbing a staircase. It takes n steps to reach the top.

			Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
			
			Example 1:
			
			Input: n = 2
			Output: 2
			Explanation: There are two ways to climb to the top.
			1. 1 step + 1 step
			2. 2 steps
			Example 2:
			
			Input: n = 3
			Output: 3
			Explanation: There are three ways to climb to the top.
			1. 1 step + 1 step + 1 step
			2. 1 step + 2 steps
			3. 2 steps + 1 step
	 */
	
	// For 1 Step , there is 1 step
	//For 2 step, 1 +1 , 2  ---2 step
	//For 3rd step, 1+1+1 ,1+2,2+1
	
	// 1,2,3,5,8,11,....(From 3 if we see , its a fibonacci series)
	//So from 1 to 3, we can return as its is
	
	
	
	
	@Test
	public void test1() {
		Assert.assertEquals(8, stepsToClimbStairCase(5));
	}
	
	public int stepsToClimbStairCase(int num) {
		if(num<=3) {
			return num;
		}
		int a =3;
		int b=2;
		for(int i=0;i<num-3;i++) {
			a=a+b;
			b=a-b;
		}
		return a;
	}
	
	
	
}
