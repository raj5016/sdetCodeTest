package mandatoryHomeWork.week17;


import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	//Bubble sort
	 @Test
	    public void test(){
	        int[] arr = {1,-5,2,3};
	        sort(arr);
	        System.out.println(Arrays.toString(arr));
	    }

	/*
	Pseudocode
	1. outer loop will be 0 to array len-1
	2. Inner loop will be i+1 to array length
	3. validate ith position in array is bigger than jth position, if so swap


	Time Complexity - O[N^2]
	Space Complexity - O[C] ~ O[1]
	 */
	    private void sort(int[] arr){
	        for(int i = 0; i < arr.length-1;i++){
	            for (int j = i+1; j < arr.length;j++){
	                if(arr[i] > arr[j]){
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	    }

}
