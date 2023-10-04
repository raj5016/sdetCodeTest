package mandatoryHomeWork.week14;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_888_FairCandySwap {
	
	//https://leetcode.com/problems/fair-candy-swap/description/
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {1,2}, fairCandySwap_ByBruteForce(new int[] {1,1}, new int[] {2,2}));
		Assert.assertArrayEquals(new int[] {1,2}, fairCandySwap_ByHashSet(new int[] {1,2}, new int[] {2,3}));

	}
	
	//Brute force:
	public int[] fairCandySwap_ByBruteForce(int[] aliceSizes, int[] bobSizes) {
        int sum1=0,sum2=0;
        for (int i = 0; i < aliceSizes.length; i++) {
        	sum1+=aliceSizes[i];
		}
        
        for (int i = 0; i < bobSizes.length; i++) {
			sum2+=bobSizes[i];
		}
        int diff=(sum2-sum1)/2;
        
        for (int i = 0; i < aliceSizes.length; i++) {
			for (int j = 0; j < bobSizes.length; j++) {
				if(bobSizes[j]-aliceSizes[i]==diff) {
					return new int[] {aliceSizes[i],bobSizes[j]};
				}
			}
		}
		return new int[]{0, 0};
    }
	
	
	//By Hashset
	public int[] fairCandySwap_ByHashSet(int[] aliceSizes, int[] bobSizes) {
		  int sumAlice=0,sumBob=0;
		  Set<Integer> aliceSet=new HashSet<Integer>();
		  
	        for (int i = 0; i < aliceSizes.length; i++) {
	        	sumAlice+=aliceSizes[i];
	        	aliceSet.add(aliceSizes[i]);
	        	
			}
	        
	        for (int i = 0; i < bobSizes.length; i++) {
				sumBob+=bobSizes[i];				
			}
	        int diff=(sumAlice-sumBob)/2;
	        
	       for (int i = 0; i < bobSizes.length; i++) {
	    	 int target=  diff+bobSizes[i];
	    	 if(aliceSet.contains(target)) {
	    		 return new int[] {target,bobSizes[i]};
	    	 }
		}
		return new int[]{0, 0};
	}

}
