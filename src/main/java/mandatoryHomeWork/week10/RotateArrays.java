package mandatoryHomeWork.week10;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrays {
	
	//https://www.codingninjas.com/studio/problems/rotate-array_1230543
	
	/*
	 *Observation 1:
	 *  k mean here is number of rotate time , 
	 *  	For positive number of k, k% length(a)
	 *  
	 *   	For Negative number of k(-1 to ---infinity)  ,k+length(a)
	 *   
	 *   
	 *   
	 */
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {8,5,6,7}, rotateArr(new int[] {5,6,7,8}, 3));
		Assert.assertArrayEquals(new int[] {2,11,2,43,1,1,7,5 }, rotateArrByTapAcademy(new int[] {7,5,2,11,2,43,1,1}, 2));
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {2,11,2,43,1,1,7,5 }, rotateArr(new int[] {7,5,2,11,2,43,1,1}, 2));
		Assert.assertArrayEquals(new int[] {2,11,2,43,1,1,7,5 }, rotateArrByTapAcademy(new int[] {7,5,2,11,2,43,1,1}, 2));
	}
	
	

	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] {6,7,5,2,11,2 }, rotateArr(new int[] {7,5,2,11,2,6}, 5));
		Assert.assertArrayEquals(new int[] {6,7,5,2,11,2 }, rotateArrByTapAcademy(new int[] {7,5,2,11,2,6}, 5));
	}
	
	
	
	@Test
	public void test4() {
		//Assert.assertArrayEquals(new int[] {2,43,1,1,7,5,2,11 }, rotateArr(new int[] {7,5,2,11,2,43,1,1}, -4));
		Assert.assertArrayEquals(new int[] {2,43,1,1,7,5,2,11 }, rotateArrByTapAcademy(new int[] {7,5,2,11,2,43,1,1}, -4));
	}
	
	
	//This will work only for positive k i.e rotate
	public int[] rotateArr(int[] arr, int rotate) {
		int temp;int j;
		
		for (int i = 0; i <rotate; i++) {
				temp = arr[0];  
				 for(j = 0; j < arr.length-1; j++){  
		                arr[j] = arr[j+1];  
		            }  
				 arr[j] = temp;  
		}
		
		return arr;
		
	}
	
	//========================================  TAP Academy=================================================================


	//Below method is used to rotate one time
	public void rotateONE(int[] arr) {
		int temp=arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
	
	//if we want to rotate ten time i.e specified time but this is not optimized method
	public int[] rotateWithSpecifiedTime(int[] arr, int k) {
		for (int i = 1; i<=k; i++) {
			rotateONE(arr);
		}
		return arr;
	}
	
	//This is optimized since we avoiding rotating number of times --Time complexity O(k*n)  so its not optimzed 
	public int[] rotateArrByTapAcademy(int[] arr, int k) {
		k=k%arr.length;                   //k=5 ,array length is 6   ==5 %6 =>5
		if(k<0) {						  //k=-2,array length is 6   ==-2+6 =>4 
			k=k+arr.length;
		}
		
		for (int i = 1; i<=k; i++) {
			rotateONE(arr);
		}
		return arr;
	}
	
	
}
