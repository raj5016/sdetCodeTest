package com.arraysLearn;

import java.util.Arrays;

public class ArraysDeepEquals {

	public static void main(String[] args) {
		//Arrays.deepEquals() performs a deep comparison, 
		//recursively comparing the elements of nested arrays and objects to determine if they are equal.
		
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};
        
        System.out.println("Deep arrays1 :"+ Arrays.deepEquals(array1, array2));
        

		int[][] array3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array4 = {{4, 5, 6}, {1, 2, 3}};
        
        System.out.println("Deep arrays2 :"+ Arrays.deepEquals(array3, array4));
        
    	int[][] array5 = {{1, 2, 3}};
        int[][] array6 = {{1, 2, 3}, {1, 2, 3}};
        
        System.out.println("Deep arrays2 :"+ Arrays.deepEquals(array3, array4));

	}

}
