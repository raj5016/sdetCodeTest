package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1232_CheckItsAStraightLine {
	
	//https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
	
	//Reference -https://www.youtube.com/watch?v=q9RVkFXRM4s
	
	@Test
	public void test() {
		Assert.assertEquals(false, checkStaright(new int[] [] {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, checkStaright(new int[] [] {{1,2},{2,3},{3,4}}));
	}
	
	public boolean checkStaright(int[][] coordinates) 
	{
		int nums1[]=coordinates[0];
		int nums2[]=coordinates[1];
		
		float slope=slope(nums1,nums2);
		
		for (int i = 2; i < coordinates.length; i++) {
				int nums3[]=coordinates[i];
				float newslope=slope(nums1,nums3);
				
				if(newslope!=slope) {
					return false;
				}
		}
		return true;
		
	}

	float slope(int[] x, int[] y) {
		return (float)(y[1]-x[1])/(y[0]-x[0]);
	}
}
