package mandatoryHomeWork.week13;

import org.junit.Assert;
import org.junit.Test;

public class SmallestSubSequences_DynamicPointer {
	
	/*
	 * Given an array of postive integers, find the smallest subsequences array 
	 * 	 length whose sum of element is greater than a given number k.    
	 *  Input=[1,2,3,4,5]   k= 10  ,  Output 3
 			Solving method: dynamic window approach 
	 */
	
	@Test
	public void test() {
	     	Assert.assertEquals(3, returnSmallestSubsequenceLength(new int[]{1,2,3,4,5}, 10));
	        Assert.assertEquals(2, returnSmallestSubsequenceLength(new int[]{1,2,4,4,1}, 7));
	        Assert.assertEquals(-1, returnSmallestSubsequenceLength(new int[]{1,2,3,4,5}, 22));
	        Assert.assertEquals(1, returnSmallestSubsequenceLength(new int[]{1,2,3,4,6}, 5));
	}
	
	public int returnSmallestSubsequenceLength(int[] arr,int k) { //1 2 3 4 5   k=10
		int i=0,j=0,sum=0;  //i=left and j=right pointer
		int distance=Integer.MAX_VALUE;
		
		while(i<=arr.length) {
			if(sum>k) {
				distance =Math.min(distance, j-i);  // here if j-1 is coming as 5 , 
																//then for mentioned input max sub sequence 1+2+3+4+5=15
				sum-=arr[i];
				i++;
			}else {  //sum<k  basically when sum is less than k , it will come inside
 				if(j==arr.length) {
					break;
				}
				sum+=arr[j];
				j++;
			}
		}
		return sum<k && distance==Integer.MAX_VALUE ?-1: distance;   //Here we are checking that 
							//total sum is less than k, and assigned distance is remained unchanged from its intial value
							// then give the input as -1 or give the exact distance
	}

}
