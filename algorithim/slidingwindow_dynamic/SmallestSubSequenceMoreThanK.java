package slidingwindow_dynamic;

import org.junit.Assert;
import org.junit.Test;

public class SmallestSubSequenceMoreThanK {

    /*https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
     * 
	 * Given an array of postive integers, find the smallest subsequences array 
	 * 	 length whose sum of element is greater than a given number k.    
	 *  Input=[1,2,3,4,5]   k= 10  ,  Output 3
 			Solving method: dynamic window approach 
	
    Pseudocode
    1. add the index of right, till sum is greater than k
    2. calculate the window size
    3. reduce the left pointer, till sum is lesser or equal to k
    4. do step 2 & 3, till right is greater than size of the arr and sum is less than the k

    Time complexity = O[N], Space Complexity = O[1]
     */

    @Test
    private void tc1(){
        Assert.assertEquals(3, smallestSubArray(new int[]{1,2,3,4,5}, 10));
        Assert.assertEquals(2, smallestSubArray(new int[]{1,2,4,4,1}, 7));
        Assert.assertEquals(-1, smallestSubArray(new int[]{1,2,3,4,5}, 22));
        Assert.assertEquals(1, smallestSubArray(new int[]{1,2,3,4,6}, 5));
    }

    private int smallestSubArray(int[] input, int k ){
        int left = 0, right = 0, output = input.length, currentSum = 0;

        while(right <= input.length){
            if(currentSum > k){
                output = Math.min(output, right-left);
                currentSum -= input[left];
                left++;
            }else {
                if(right == input.length)
                    break;
                currentSum += input[right];
                right++;
            }
        }
        return currentSum < k && output == input.length ? -1 : Math.min(output, right-left+1);
    }
}

