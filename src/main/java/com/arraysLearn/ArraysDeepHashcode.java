package com.arraysLearn;

import java.util.Arrays;

public class ArraysDeepHashcode {

	public static void main(String[] args) {
	      	int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
	        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};

	        int hashCode1 = Arrays.deepHashCode(array1);
	        int hashCode2 = Arrays.deepHashCode(array2);

	        System.out.println("Hash code for array1: " + hashCode1);
	        System.out.println("Hash code for array2: " + hashCode2);

	        System.out.println("Are the hash codes equal? " + (hashCode1 == hashCode2));
	        
	        
	      	int[][] array3 = {{1, 2, 3}, {4, 5, 6}};
	        int[][] array4 = {{4, 5, 6}, {1, 2, 6}};
	        
	        int hashCode3 = Arrays.deepHashCode(array3);
	        int hashCode4 = Arrays.deepHashCode(array4);
	        
	        System.out.println("Hash code for array3: " + hashCode3);
	        System.out.println("Hash code for array4: " + hashCode4);

	        System.out.println("Are the hash codes equal? " + (hashCode3 == hashCode4));
	        System.out.println("Are array3 and array4 equal? " + Arrays.deepEquals(array3, array4));

	    
	        
	    }
	}


