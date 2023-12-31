package mandatoryHomeWork.week11;

import org.junit.Test;
import org.testng.Assert;



public class LeetCode_1051_HeightChecker {
	
	//https://leetcode.com/problems/height-checker/submissions/
	
	@Test
	public void test() {
		Assert.assertEquals(3,heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(5,heightChecker(new int[] {5,1,2,3,4}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0,heightChecker(new int[] {1,2,3,4,5}));
	}
	
	 public int heightChecker(int[] heights) {
	        //int[] heights1=Arrays.copyOf(heights, heights.length);
	        int[] heights1=heights.clone();

	        int temp=0;
	        int indexCount=0;
	        
	        for(int i=0;i<heights1.length;i++){
	             for(int j=i+1;j<heights1.length;j++){
	                    if(heights1[i]>heights1[j]){
	                        temp=heights1[j];
	                        heights1[j]=heights1[i];
	                        heights1[i]=temp;
	                    }
	             }
	        }
	        
	        // if manual reverse is not required, use Arrays.sort(heights)
            // so 36 to 44 line is not required
	        
	         for(int i=0;i<heights.length;i++){
	             if(heights[i]!=heights1[i]){
	                 indexCount++;
	             }
	         }
	         return indexCount;
	    }
	   
}
