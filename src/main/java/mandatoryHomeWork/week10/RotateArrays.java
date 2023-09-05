package mandatoryHomeWork.week10;

import org.junit.Test;

public class RotateArrays {
	
	//https://www.codingninjas.com/studio/problems/rotate-array_1230543
	
	/*
	 * 
	 */
	
	@Test
	public void test() {
		int[] output =rotateArr(new int[] {5,6,7,8}, 3);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
	
	@Test
	public void test1() {
		int[] output =rotateArr(new int[] {7,5,2,11,2,43,1,1}, 2);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
	

	public int[] rotateArr(int[] arr, int rotate) {
		 //5 6 7 8   ===3  6 7 8 5 ,7 8 5 6, 8 5 6 7
		int temp;int j;
		
		for (int i = 0; i <rotate; i++) {
				temp = arr[0];  
				 for(j = 0; j < arr.length-1; j++){  
		                //Shift element of array by one  
		                arr[j] = arr[j+1];  
		            }  
				 arr[j] = temp;  
		}
		
		return arr;
		
	}
}
