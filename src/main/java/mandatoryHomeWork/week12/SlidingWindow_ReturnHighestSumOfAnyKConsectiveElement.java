package mandatoryHomeWork.week12;

import org.junit.Test;

public class SlidingWindow_ReturnHighestSumOfAnyKConsectiveElement {
	
	
	//Given an array of integers and a numbers k,Return the highest sum of any k consectives elements in array
	// input array={1,5,2,3,7,1} k=3;
	
	
	@Test
	public void test() {
		//System.out.println(returnHighestSumOfKElementByBruteForce(new int[] {-1,-5,-7}, 3));
		System.out.println(slidingWindow(new int[] {1,5,2,3,7,1}, 3));
	}
	
	public int returnHighestSumOfKElementByBruteForce(int[]  arr,int k) {
		int maxSum = 0;
		int currentSum = 0;
		
		if (k <= 0 || k > arr.length) {
			return -1; // Invalid input
		}
		
		
		for (int i = 0; i < k; i++) {
			maxSum = maxSum + arr[i];
		}
		
		currentSum=maxSum;
		 
		for (int i = k; i < arr.length; i++) {
			currentSum=currentSum+arr[i]-arr[i-k];
			 //maxSum = Math.max(maxSum, currentSum);
			 if (currentSum > maxSum) {
	                maxSum = currentSum;
	            }
		}
		
		return maxSum;
	}

	
	private int slidingWindow(int[] nums, int k){
        //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer] - nums[pointer-k];
            pointer++;
        }
        return Math.max(currentSum, max);
    }
}
