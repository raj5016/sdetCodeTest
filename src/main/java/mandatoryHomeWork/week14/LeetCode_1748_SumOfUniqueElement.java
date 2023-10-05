package mandatoryHomeWork.week14;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1748_SumOfUniqueElement {
	
	//https://leetcode.com/problems/sum-of-unique-elements/description/
	
	@Test
	public void test() {
		Assert.assertEquals(4, sumOfUnique(new int[] {1,2,3,2}));
		Assert.assertEquals(0, sumOfUnique(new int[] {1,1,1,1,1}));
	}
	
	 public int sumOfUnique(int[] nums) {
	      Map<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	      int sum=0;
	      
	      for(int num:nums){
	          hmap.put(num, hmap.getOrDefault(num, 0)+1);
	      }

	      for( Map.Entry<Integer,Integer> entry: hmap.entrySet()) {
	    	  if(entry.getValue()==1) {
	    		  sum+=entry.getKey();
	    	  }
	      }
		return sum;
	   
	    }
}
