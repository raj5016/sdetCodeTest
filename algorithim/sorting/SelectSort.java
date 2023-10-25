package mandatoryHomeWork.week17;


import java.util.Arrays;

import org.junit.Test;

public class SelectSort {
	
	
	  @Test
	    public void test(){
	        int[] arr = {1,-5,2,3, -5};
	        sort(arr);
	        System.out.println("Selection Sort : "+Arrays.toString(arr));
	    }

	/*
	Pseudocode
	1. outer loop will be 0 to array len-1
	2. Inner loop will be i+1 to array length
	3. find the minimum value index
	4. swap with the minimum index with current index


	Time Complexity - O[N^2]
	Space Complexity - O[C] ~ O[1]
	 */
	    private void sort(int[] arr){
	        int minimumIndex;
	        for(int i = 0; i < arr.length-1;i++){
	            minimumIndex = i;
	            for (int j = i+1; j < arr.length;j++)
	               if(arr[minimumIndex] > arr[j])
	                   minimumIndex = j;

	            if(minimumIndex != i){
	                int temp = arr[i];
	                arr[i] = arr[minimumIndex];
	                arr[minimumIndex] = temp;
	            }
	        }
	    }
}


