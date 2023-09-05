package mandatoryHomeWork.week10;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayByReverseWay {
	
	//https://www.codingninjas.com/studio/problems/rotate-array_1230543
	
	/*
	 *Observation :
	 *  k mean here is number of rotate time , 
	 *  	For positive number of k, k% length(a)
	 *  
	 *   	For Negative number of k(-1 to ---infinity)  ,k+length(a)
	 *   	
	 *   	Create Reverse Function , write a logic to reverse the array based on given start and end Index
	 *   	
	 *   	Create a rotate function, apply the logic of k rotate time
	 *   	
	 *   	Call the reverse function for reversing until the k
	 *   	
	 *   	Call the reverse function for reversing from the k to array length
	 *   
	 *   	Call the reverse function for reversing from the 0 to array length
	 *   
	 *   
	 */
	

	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] {6,7,5,2,11,2 }, rotate(new int[] {7,5,2,11,2,6}, 5));
	}
	
	
	
	@Test
	public void test4() {
		Assert.assertArrayEquals(new int[] {2,43,1,1,7,5,2,11 }, rotate(new int[] {7,5,2,11,2,43,1,1}, -4));
	}
	
	
	public void reverseTheArray(int[] arr,int startIndex,int endIndex) {
		while(startIndex<endIndex) {
			int temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			startIndex++;
			endIndex--;
		}
	}
	
	public int[] rotate(int[] arr,int k) {
		k=k%arr.length;
		if(k<0) {
			k=k+arr.length;
		}
		//input [ 1,2,3,4,5]  k is 3   the 
		reverseTheArray(arr, 0, k-1);  //output  3 2 1 4 5
		reverseTheArray(arr, k, arr.length-1); // output 3 2 1 5 4
		reverseTheArray(arr, 0, arr.length-1); // output 4 5 1 2 3
		return arr;
		
	}

}
	