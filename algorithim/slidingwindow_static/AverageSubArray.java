package slidingwindow_static;

import org.junit.Test;

public class AverageSubArray {
	

	@Test
	public void test() {
		System.out.println(averageOfSubArray(new int[] {1,3,5,1}, 4));//2.0
	}
	
	@Test
	public void test1() {
		System.out.println(averageOfSubArray(new int[] {1,12,-5,-6,50,3}, 4));//12.75
	}
	
	@Test
	public void test2() {
		System.out.println(averageOfSubArray(new int[] {5}, 1)); //5.0
	}
	
	public double averageOfSubArray(int[] arr,int k) {
        double max = Integer.MIN_VALUE;
        double avg =0;
		int currentSum=0;
		int  pointer = 0;
		
		while(pointer<k) {
			currentSum=currentSum+arr[pointer++];
		}
		
	     avg=currentSum/k;
		 if(avg > max ){
             max = avg;
         }
		
		while(pointer<arr.length)
		{
			currentSum+=arr[pointer]-arr[pointer-k];
			avg=(double)currentSum/k;
			if(avg > max ){
	            max = avg;
	        }
			pointer++;
		} 
		
		return max;
		
	}

}
