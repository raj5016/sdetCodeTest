package com.arraysLearn;

import java.util.Arrays;

public class ArraysHasCode {
	
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 6, 7, 8};

        System.out.println("Hash code for array1: " + Arrays.hashCode(array1));
        System.out.println("Hash code for array2: " + Arrays.hashCode(array2));
        System.out.println("Hash code for array3: " + Arrays.hashCode(array3));

        System.out.println("Are array1 and array2 equal? " + Arrays.equals(array1, array2));
        System.out.println("Hash codes for array1 and array2: " + (Arrays.hashCode(array1) == Arrays.hashCode(array2)));
    }
	
}

