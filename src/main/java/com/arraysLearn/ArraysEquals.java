package com.arraysLearn;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		
		int[] arr1= {23,12,56,1,23,2};
		
		int[] arr2= {23,12,56,1,23,2};
		
		System.out.println("Deep equals :" + Arrays.equals(arr1, arr2));

		
		int[] arr3= {23,12,56,1,23,2};
		
		int[] arr4= {23,12,2,1,23,2};
		
		System.out.println("Deep equals :" + Arrays.equals(arr3, arr4));

	}

}
