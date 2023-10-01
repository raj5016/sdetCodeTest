package mandatoryHomeWork.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_228_SummaryRanges {
	
		@Test
		public void test() {
			Assert.assertEquals(Arrays.asList("0->2","4->5","7"), summaryRanges(new int[] {0,1,2,4,5,7}));
		}
	
		public List<String> summaryRanges(int[] nums) {
			List<String> list=new ArrayList<String>();
			int fromIndex=0;
			int toIndex=nums.length;
			
			
			for (int i = 0; i <=nums.length-1; i++) {
				fromIndex=i;
				while(i!=nums.length-1 && nums[i]+1==nums[i+1]) {
					i++;
				}
				toIndex=i;
				if (fromIndex == toIndex) {
	                list.add("" + nums[fromIndex]);

	            } else {
	            	list.add(nums[fromIndex] + "->" + nums[toIndex]);

	            }

	        }	            
		
		return list;
        
    }

}
