package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;


public class LeetCode_605_CanPlaceFlowers {
	
	
	//https://leetcode.com/problems/can-place-flowers/description/
	
	@Test
	public void test() {
       Assert.assertEquals(true, canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
    }
	
	@Test
	public void test1() {
       Assert.assertEquals(false, canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
    }
	
	@Test
	public void test2() {
       Assert.assertEquals(true, canPlaceFlowers(new int[] {0,0,1}, 1));
    }
	
	@Test
	public void test3() {
       Assert.assertEquals(true, canPlaceFlowers(new int[] {1,0,0}, 1));
    }
	
	@Test
	public void test4() {
       Assert.assertEquals(false, canPlaceFlowers(new int[] {1,0,0}, 2));
    }
	
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count=0;
		
		for (int i = 0; i < flowerbed.length; i++) {
			if(flowerbed[i]==0) {
				//i-1 ,i+1,it will cause array index bound of exception,so we consider for first element
				// there is no previous element for first element and no next element for last element and so we can consider condition i==0
				int prev=((i==0||flowerbed[i-1]==0)?0:1); 
				
				int next=((i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1);
				
				if(prev==0 && next==0) {
					count++;
					flowerbed[i]=1;
				}
			}
			if(count>=n) {
				return true;
			}
				
		}
		return false;
		
	}
	 



}
