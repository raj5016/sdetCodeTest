package twoPointer;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_283_MoveZeroes {
	
	//https://leetcode.com/problems/move-zeroes/
	
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, moveAllZeroToEnd(new int[] {0,1,0,3,12}));
	}
	
	//[0,1,0,3,12]
	public int[] moveAllZeroToEnd(int[] arr) {
		
		int i=0;
		int j=1;
		
		while(j<arr.length) {
			if(arr[i]==0 && arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}else if(arr[i]!=0 && arr[j]==0) {
				i++;
			}else if(arr[i]==0 && arr[j]==0) {
				j++;
			}else if(arr[i]!=0 && arr[j]!=0){
				i++;
				j++;
			}
		}
		
		return arr;
	}

}
