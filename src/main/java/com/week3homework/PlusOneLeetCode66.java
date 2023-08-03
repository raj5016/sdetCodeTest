package com.week3homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneLeetCode66 {
	
	@Test
	public void test() {
		Assert.assertEquals(new int[] {1,2,4},plusOne(new int[] {1,2,3}));
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {4,3,2,2},plusOne(new int[] {4,3,2,1}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {1,0},plusOne(new int[] {9}));
	}
	
	
	
	public int[] plusOne(int[] arr) {
		 for(int i=arr.length-1;i>=0;i--){
	            if(arr[i]<9){
	            	arr[i]++;
	                return arr;
	            }
	            arr[i]=0;
	        }

		 arr=new int[arr.length+1];
		 arr[0]=1;
	        return arr;
		
	}

}
