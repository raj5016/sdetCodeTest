package com.arraysLearn;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {
			int[] number=new int[5];
			Arrays.fill(number, 3);
			System.out.println("Filled arrays is :"+ Arrays.toString(number));
			
			int[] numbe1=new int[5];

			Arrays.fill(numbe1, 2, 4, 6);
			
			System.out.println("Filled arrays with index range is :"+ Arrays.toString(numbe1));
	}

}
