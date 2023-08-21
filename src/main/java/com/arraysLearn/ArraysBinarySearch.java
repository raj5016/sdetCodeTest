package com.arraysLearn;

import java.util.Arrays;

import org.junit.Test;


public class ArraysBinarySearch {
	
	//The time complexity of the Arrays.binarySearch() method is O(log n)
	
	@Test
	public void test() {
		binarySearch();
	}
	
	// Program to show case binarySearch() method
	public void binarySearch() {
		int[] arr= {90,43,68,45,71};
		Arrays.sort(arr);//43,45,68,75,90

		int eleToFindIndex=43;
		System.out.println(eleToFindIndex + " is found at index = "+ Arrays.binarySearch(arr, eleToFindIndex));
	}
	
	
	@Test
	public void test1() {
		binarySearchByIndex();
	}
	//Method 2:
	
	public void binarySearchByIndex() {
		int[] arr= {90,43,68,45,71};
		Arrays.sort(arr);//43,45,68,75,90

		int eleToFindIndex=75;
		int fromIndex=0;
		int toIndex=3;
		
		System.out.println(eleToFindIndex + " is found at index = "+ Arrays.binarySearch(arr, fromIndex, toIndex, eleToFindIndex));
	}
}
