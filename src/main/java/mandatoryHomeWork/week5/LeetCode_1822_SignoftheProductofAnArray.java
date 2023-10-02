package mandatoryHomeWork.week5;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1822_SignoftheProductofAnArray {
	
	//https://leetcode.com/problems/sign-of-the-product-of-an-array/
	@Test
	public void test() {
		Assert.assertEquals(1, arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(0, arraySign(new int[] {1,5,0,2,-3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(-1, arraySign(new int[] {-1,1,-1,1,-1}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, arraySign(new int[] {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
	}
	
	//done by own- Failed test3
	public int arraySign(int[] nums) {
		int product=1;
		for (int i = 0; i < nums.length; i++) {
			product=product*nums[i];
		}
		
		if(product>0) {
			return 1;
		}else if(product<0) {
			return -1;
		}
		
		return 0;
	}

	
	 public int arraySign2(int[] nums) {
	        int m=1;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]>0){
	                m=m*1;
	            }else if(nums[i]<0){
	                m*=-1;
	            }else{
	                m*=0;
	            }
	        }
	        if(m>0){
	            return 1;
	        }else if(m==0){
	             return 0;
	        }else{
	            return -1;
	        }
	    }
}
