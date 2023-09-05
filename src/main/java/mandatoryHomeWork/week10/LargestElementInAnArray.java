package mandatoryHomeWork.week10;

import org.junit.Test;

public class LargestElementInAnArray {
	//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
	@Test
	public void test() {
		System.out.println(largestelementInArray(new int[] {4,7,8,6,7,6}));
	}
	
	@Test
	public void test1() {
		System.out.println(largestelementInArray(new int[] {5,9,3,4,8,4,3,10 }));
	}
	
	public int largestelementInArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		//int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		return max;
		
	}
}
