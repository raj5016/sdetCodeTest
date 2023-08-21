package com.arraysLearn;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {23,45,66,12,33};
		
		System.out.println("Arrays is :" + Arrays.toString(arr));
		
		//After  copy it will create new copy and pointing to other reference 
		System.out.println("New Integer Array is: "+Arrays.toString(Arrays.copyOf(arr, 8)));
		
		
		//Copy by range
		
		System.out.println("Copy by range :"+ Arrays.toString(Arrays.copyOfRange(arr, 0, 3)));

	}

}
