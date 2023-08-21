package com.arraysLearn;

import java.util.Arrays;
import java.util.List;

public class AsListMethodInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,6,1};
		//converting arrays into List
		System.out.println(Arrays.asList(arr));
		
		
		List<Integer> list = Arrays.asList(1,2,3); // Using Integer wrapper type
		System.out.println(list);

	}

}
